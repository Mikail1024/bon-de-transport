/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Node;

import fr.santesocial.assertion.commun.AssertionException;
import fr.santesocial.assertion.cps.CpsAssertionBuilder;
import fr.santesocial.assertion.cps.CpsInfo;
import fr.santesocial.assertion.cps.DialogSaisieCodePorteur;
import fr.santesocial.assertion.structure.StructureAssertionBuilder;
import fr.santesocial.assertion.vitale.VitaleAssertionBuilder;
import fr.santesocial.assertion.vitale.VitaleInfo;

/**
 * Fabrique d'assertions Structure,PS et Vitale &agrave; la norme SAML
 * 
 * @author GIE SESAM-VITALE - 2014
 *
 */
public class AssertionFactory {
    // Gestion des traces
    private static final Logger log = LogManager.getLogger(AssertionFactory.class);

    // délai de validité de l'assertion PS
    private static long DELAI_VALIDITE_ASSERTION_PS = 20; // délai en secondes

    private CpsAssertionBuilder psAssertionBuilder;
    private StructureAssertionBuilder structureAssertionBuilder;
    private String pin; // code pin de la CPS (null si pas encore saisi
    private Date creationTime; // heure création assertion PS
    private double delaiAssertion; // délai de validité de l'assertion PS
    private Node assertionPS; // derniére assertion PS créée
    private Node assertionStructure; // derniere assertion Structure creee
    private VitaleAssertionBuilder vitAssertionBuilder;

    /**
     * initialisation des varibles d'instance de la classe
     * 
     * @throws AssertionException
     */
    private void init() throws AssertionException {
	pin = null;
	creationTime = null;
	delaiAssertion = DELAI_VALIDITE_ASSERTION_PS;
	assertionPS = null;
	assertionStructure = null;
	psAssertionBuilder = new CpsAssertionBuilder();
	structureAssertionBuilder = new StructureAssertionBuilder();
	vitAssertionBuilder = new VitaleAssertionBuilder();
    }

    /**
     * instanciation de la classe
     * 
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public AssertionFactory() throws AssertionException {
	init();

    }

    /**
     * Restitue la liste des infos des slots contenant une CPS
     * 
     * @param cpsLibPath le chemin vers la cryptolib
     * @return la liste des infos CPS
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public CpsInfo[] getListeCps(String cpsLibPath) throws AssertionException {
	return psAssertionBuilder.getCpsSlotInfo(cpsLibPath);
    }

    /**
     * Etablit la ressource CPS &agrave; partir de laquelle l'assertion PS doit
     * &ecirc;tre g&eacute;n&eacute;r&eacute;e
     * 
     * @param cpsLibPath le chemin vers la cryptolib
     * @param slot       num&eacute;ro du lecteur de la CPS
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public void setCps(String cpsLibPath, long slot) throws AssertionException {
	log.debug("Slot CPS = " + slot);
	psAssertionBuilder.selectCpsSlot(cpsLibPath, slot);
    }

    /**
     * Restitue la liste des lecteurs conternant une carte Vitale
     * 
     * @param ressourcesGalss la liste des noms de ressources galss connues pour les
     *                        cartes Vitale
     * @return la liste des lecteurs et cartes Vitale
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public VitaleInfo[] getListVitale(String[] ressourcesGalss) throws AssertionException {
	return vitAssertionBuilder.getListRessources(ressourcesGalss);
    }

    /**
     * Etablit la ressource Vitale &agrave; partir de laquelle l'assertion Vitale
     * doit &ecirc;tre g&eacute;n&eacute;r&eacute;e
     * 
     * @param ressource nom de la ressource lecteur Vitale
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public void setVitale(String ressource) throws AssertionException {
	log.debug("Ressource Vitale = " + ressource);
	vitAssertionBuilder.setRessource(ressource);
    }

    /**
     * Modifie le d&eacute;lai de validit&eacute; de l'assertion PS (d&eacute;faut =
     * 20 secondes)
     * 
     * @param delai nouveau d&eacute;lai de validit&eacute;
     */
    public void setDelaiValiditeAssertionPS(long delai) {
	this.delaiAssertion = delai;
	log.debug("Délai validité assertion PS = " + delai);
    }

    /**
     * Ajoute un attribut SAML aux futures assertions PS
     * 
     * @param name  nom de l'attribut SAML
     * @param value valeur de l'attribut SAML
     */
    public void addPSAttribute(String name, String value) {
	log.debug("Ajout attribut à l'assertion PS : nom = " + name + " - valeur = " + value);
	psAssertionBuilder.addAttribute(name, value);
	assertionPS = null; // on force la création d'une nouvelle assertion à la prochaine lecture
    }

    /**
     * supprime un attribut SAML aux futures assertions PS
     * 
     * @param name nom de l'attribut SAML
     */
    public void delPSAttribute(String name) {
	log.debug("Suppression de l'attribut " + name + " de l'assertion PS");
	psAssertionBuilder.delAttribute(name);
	assertionPS = null; // on force la création d'une nouvelle assertion à la prochaine lecture
    }

    /**
     * Ajoute un attribut SAML aux futures assertions Vitale
     * 
     * @param name  nom de l'attribut SAML
     * @param value valeur de l'attribut SAML
     */
    public void addVitaleAttribute(String name, String value) {
	log.debug("Ajout attribut à l'assertion Vitale : nom = " + name + " - valeur = " + value);
	vitAssertionBuilder.addAttribute(name, value);
    }

    /**
     * supprime un attribut SAML aux futures assertions Vitale
     * 
     * @param name nom de l'attribut SAML
     */
    public void delVitaleAttribute(String name) {
	log.debug("Suppression de l'attribut " + name + " de l'assertion Vitale");
	vitAssertionBuilder.delAttribute(name);
    }

    /**
     * Obtient une assertion PS (nouvelle ou &eacute;gale &agrave; la
     * pr&eacute;c&eacute;dente si d&eacute;lai validit&eacute; non
     * d&eacute;pass&eacute;) &agrave; partir du slot CPS initialis&eacute; via la
     * m&eacute;thode setCps
     * 
     * @return le noeud XML de l'assertion PS cr&eacute;&eacute;e
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public Node getAssertionPS() throws AssertionException {
	if (pin == null) { // pas encore saisi de code pin
	    log.debug("Saisie du code pin CPS");
	    DialogSaisieCodePorteur dscp = new DialogSaisieCodePorteur(); // DialogSaisieCodePorteur.getInstance();
	    pin = dscp.showDialog();
	    assertionPS = null;
	}
	if (creationTime != null) {
	    Date maintenant = new Date();
	    if (((maintenant.getTime() - creationTime.getTime()) / 1000) > delaiAssertion) {
		log.debug("Assertion PS obsolète");
		assertionPS = null;
	    }
	} else { // pas encore créé d'assertion PS (car pas d'heure de création notée)
	    log.debug("Première création d'assertion PS");
	    assertionPS = null;
	}
	if (assertionPS == null) { // il faut créer une assertion
	    assertionPS = psAssertionBuilder.createAssertion(pin);

	    creationTime = new Date(); // on note l'heure de création
	} else if (log.isDebugEnabled()) {
	    log.debug("Même assertion PS");
	}
	return assertionPS;
    }

    /**
     * 
     * @param structureIni ( fichier de configuration de la structure
     *                     "structure.ini))
     * @return le noeud XML de l'assertion Structure
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public Node getAssertionStructure(File structureIni) throws AssertionException {

	log.debug("Creation d'assertion Structure");
	assertionStructure = null;
	try {
	    String identifiantDeleguant = null;
	    String identifiantFacturation = null;
	    String convtech = null;
	    String nameId = null;
	    String certificat = null;
	    String key = null;
	    String keypass = null;

	    try {
		Properties p = new Properties();
		// chargement du fichier de configuration
		p.load(new FileInputStream(structureIni));

		// parametre (optionnel)
		identifiantDeleguant = p.getProperty("idDeleguant");
		identifiantFacturation = p.getProperty("idFacturation");

		// paramêtres obligatoires

		convtech = p.getProperty("convtech");

		nameId = p.getProperty("nameId");

		certificat = p.getProperty("certificat");
		key = p.getProperty("key");
		keypass = p.getProperty("keypass");
	    } catch (Exception e) {
		System.out.println(e);
	    }
	    assertionStructure = structureAssertionBuilder.withIdentifiantFacturation(identifiantFacturation)
		    .withIdentifiantDeleguant(identifiantDeleguant).withNameId(nameId).withConventionTechnique(convtech)
		    .withCertificat(certificat).withPrivateKey(key, keypass).build();
	} catch (AssertionException e) {
	    throw new AssertionException(e);
	}

	return assertionStructure;
    }

    /**
     * Cr&eacute;e une assertion Vitale avec la ressource initialis&eacute;e via la
     * m&eacute;thode setRessourceVitale
     * 
     * @param issuer    valeur de l'&eacute;lement Issuer de l'assertion
     * @param signature true si l'assertion doit être sign&eacute;e, false sinon
     * @return le noeud contenant l'assertion
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public Node createAssertionVitale(String issuer, boolean signature) throws AssertionException {
	log.debug("Assertion Vitale Issuer = " + issuer);
	return vitAssertionBuilder.createAssertion(issuer, signature);
    }

    /**
     * Cr&eacute;e une assertion Vitale dont l'issuer est le NameID de la CPS ayant
     * cr&eacute;&eacute; la derni&egrave;re assertion PS
     * 
     * @param signature true si l'assertion doit être sign&eacute;e, false sinon
     * @return le noeud contenant l'assertion
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public Node createAssertionVitale(boolean signature) throws AssertionException {
	log.debug("Assertion Vitale Issuer = " + psAssertionBuilder.getNameID());
	return vitAssertionBuilder.createAssertion(psAssertionBuilder.getNameID(), signature);
    }
}
