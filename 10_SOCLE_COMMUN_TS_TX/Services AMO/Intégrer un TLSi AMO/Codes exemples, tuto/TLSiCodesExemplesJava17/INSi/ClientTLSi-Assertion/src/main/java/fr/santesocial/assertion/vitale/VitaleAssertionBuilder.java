/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion.vitale;

import java.util.ArrayList;
import java.util.List;

import javax.smartcardio.CardException;
import javax.smartcardio.CardTerminal;
import javax.smartcardio.TerminalFactory;
import javax.xml.transform.dom.DOMSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import com.sun.jna.ptr.IntByReference;

import fr.santesocial.assertion.commun.AbstractAssertionBuilder;
import fr.santesocial.assertion.commun.AssertionException;
import fr.santesocial.assertion.util.Conversion;
import fr.santesocial.mica.jnamica.ErreurMica;
import fr.santesocial.mica.jnamica.FabriqueAccesMica;
import fr.santesocial.mica.jnamica.IMica;
import fr.santesocial.mica.jnamica.output.ByteArray;

/**
 * Construction d'une assertion Vitale au standard SAML
 * 
 * @author GIE SESAM-VITALE - 2014
 *
 */
public class VitaleAssertionBuilder extends AbstractAssertionBuilder {
    /**
     * Gestion des traces
     */
    private static final Logger log = LogManager.getLogger(VitaleAssertionBuilder.class);
    /**
     * Répertoire d'installation de MICA (64 bits).<br>
     * Le répertoire 32 bits est "C:\\Program Files (x86)\\santesocial\\mica\\"
     */
    public static final String MICA_DIR = "C:\\Program Files\\santesocial\\mica\\";

    /**
     * Ressource lecteur de la carte Vitale
     */
    private String ressource;

    /**
     * Interface MICA
     */
    private IMica jnaMica;

    /**
     * Constructeur par d&eacute;faut
     * 
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public VitaleAssertionBuilder() throws AssertionException {
	this(MICA_DIR);
    }

    /**
     * Constructeur par d&eacute;faut
     * 
     * @param micaDir le répertoire d'installation de MICA (c'est-à-dire le
     *                répertoire contenant la DLL mica.dll)
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public VitaleAssertionBuilder(String micaDir) throws AssertionException {
	super();
	ressource = null;
	// Chargement de la librairie MICA
	// => À personnaliser pour le LPS
	jnaMica = FabriqueAccesMica.getAccesMica(FabriqueAccesMica.TYPE_ACCES_JNA);
	int ret = jnaMica.MICA_Init(null, micaDir);
	if (ret != 0) {
	    log.debug("Erreur MICA_Init = " + Integer.toHexString(ret).toUpperCase().substring(4));
	    throw new AssertionException(
		    "Erreur initialisation MICA " + Integer.toHexString(ret).toUpperCase().substring(4));
	}
    }

    /**
     * Constructeur avec un attribut SAML
     * 
     * @param name  nom de l'attribut SAML
     * @param value valeur de l'attribut SAML
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public VitaleAssertionBuilder(String name, String value) throws AssertionException {
	super(name, value);
	ressource = null;
	// Chargement de la librairie MICA
	// => À personnaliser pour le LPS
	jnaMica = FabriqueAccesMica.getAccesMica(FabriqueAccesMica.TYPE_ACCES_JNA);
	int ret = jnaMica.MICA_Init(null, "C:\\Program Files (x86)\\santesocial\\mica\\");
	if (ret != 0) {
	    log.error("Erreur MICA_Init = " + Integer.toHexString(ret).toUpperCase().substring(4));
	    throw new AssertionException(
		    "Erreur initialisation MICA " + Integer.toHexString(ret).toUpperCase().substring(4));
	}
    }

    /**
     * restitue la liste des ressources Vitale
     * 
     * @param ressourcesGalss la liste des noms de ressources galss connues pour les
     *                        cartes Vitale
     * @return la liste des noms des lecteurs Vitale + num&eacute;ros de
     *         s&eacute;rie Vitale
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public VitaleInfo[] getListRessources(String[] ressourcesGalss) throws AssertionException {
	// Liste des lecteurs PC/SC
	try {
	    TerminalFactory factory = TerminalFactory.getDefault();
	    List<CardTerminal> terminals = factory.terminals().list();
	    log.debug(terminals.size() + " lecteurs :");
	    if (log.isDebugEnabled()) {
		for (int i = 0; i < terminals.size(); i++) {
		    log.debug(terminals.get(i).getName());
		}
	    }
	    ArrayList<VitaleInfo> vitaleInfos = new ArrayList<VitaleInfo>();
	    // parcours des lecteurs PC/SC pour identifier les lecteurs sans CPS
	    for (int i = 0; i < terminals.size(); i++) {
		String noSerieVitale = testPresenceVitale(terminals.get(i).getName());
		if (noSerieVitale != null) { // si pas de CPS dans le lecteur
		    vitaleInfos.add(new VitaleInfo(terminals.get(i).getName(), noSerieVitale));
		}
	    }
	    // parcours des ressources Galss pour identifier celles sans CPS
	    if (ressourcesGalss != null) {
		for (int i = 0; i < ressourcesGalss.length; i++) {
		    String noSerieVitale = testPresenceVitale(ressourcesGalss[i]);
		    if (noSerieVitale != null) { // si pas de CPS dans le lecteur
			vitaleInfos.add(new VitaleInfo(ressourcesGalss[i], noSerieVitale));
		    }
		}
	    }
	    return vitaleInfos.toArray(VitaleInfo[]::new);
	} catch (CardException e) {
	    throw new AssertionException("Erreur PCSC", e);
	}
    }

    /**
     * test la présence d'une carte Vitale dans le lecteur
     * 
     * @param lecteur
     * @return le numero de serie de la carte Vitale, "0" si carte absente, null si
     *         pas lecteur Vitale
     */
    private String testPresenceVitale(String lecteur) {
	String numeroSerie = null;

	log.debug("testPresenceVitale(" + lecteur + ")");
	ByteArray numSerie = new ByteArray(21);
	IntByReference etat = new IntByReference();
	int ret = jnaMica.MICA_ControlePresenceCarteVitale(lecteur, numSerie, etat) & 0xFFFF; // code erreur mica =
											      // seulement les 16 bits
											      // de poids faible
	if (ret == ErreurMica.MICA_NON_ERR) {
	    numeroSerie = Conversion.BufToString(numSerie, 20);
	} else {
	    log.error("Erreur MICA_ControlePresenceCarteVitale(" + lecteur + ") = "
		    + Integer.toHexString(ret).toUpperCase());
	    if ((ret == ErreurMica.MICA_ERR_CAR_ABS) || (ret == ErreurMica.MICA_ERR_VIT_ABS)
		    || (ret == ErreurMica.MICA_ERR_CAR_INVALIDE)) {
		numeroSerie = "0";
	    }
	}
	log.debug("fin testPresenceVitale : numeroSerie = " + numeroSerie);
	return numeroSerie;
    }

    /**
     * Initialise le nom de la ressource lecteur Vitale
     * 
     * @param nomRessource le nom de la ressource lecteur contenant la carte Vitale
     *                     &agrave; utiliser
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public void setRessource(String nomRessource) throws AssertionException {
	this.ressource = nomRessource;
	signFac = new VitaleSignatureFactory(nomRessource);
    }

    /**
     * Cr&eacute;e une assertion Vitale
     * 
     * @param issuer    emetteur (id PS) &agrave; renseigner dans l'assertion
     * @param signature true si signature de l'assertion vitale
     * @return noeud XML de l'assertion
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public Node createAssertion(String issuer, boolean signature) throws AssertionException {
	log.debug(">>createAssertion");
	if (ressource == null) {
	    throw new AssertionException("Création assertion Vitale impossible sans nom de ressource");
	}
	// on valorise l'attribut NameQualifier du NameID de l'assertion
	nameQualifier = "VITALE";

	// on valorise le numéro de série Vitale dans le NameID de l'assertion
	ByteArray numSerie = new ByteArray(21);
	IntByReference etat = new IntByReference();
	int ret = jnaMica.MICA_ControlePresenceCarteVitale(ressource, numSerie, etat);
	if (ret == ErreurMica.MICA_NON_ERR) {
	    // le n° de série logique Vitale ne fait que 12 car max => suppression des 8
	    // zéros à gauche
	    this.nameID = new String(Conversion.BufToString(numSerie, 20)).substring(8);
	} else {
	    log.error(
		    "Erreur MICA_ControlePresenceCarteVitale = " + Integer.toHexString(ret).toUpperCase().substring(4));
	    throw new AssertionException(
		    "Erreur MICA_ControlePresenceCarteVitale " + Integer.toHexString(ret).toUpperCase().substring(4));
	}

	// on valorise l'issuer de l'assertion
	// => À personnaliser pour le LPS
	if (issuer == null) {
	    log.error("Issuer non renseigné");
	    throw new AssertionException("Issuer non renseigné pour l'assertion Vitale");
	}
	this.issuer = issuer;

	// Construction de l'assertion SAML + XML-Signature
	// ------------------------------------------------
	log.warn("Début Assertion Vitale");
	Document doc = buildAssertion(signature, null);
	log.warn("Fin assertion Vitale");

	if (log.isDebugEnabled()) {
	    // Enregistrement du document après signature
	    saveInFile(new DOMSource(doc), "AssertionVitale.xml");
	}
	log.debug("<<createAssertion");
	return doc.getFirstChild();
    }
}
