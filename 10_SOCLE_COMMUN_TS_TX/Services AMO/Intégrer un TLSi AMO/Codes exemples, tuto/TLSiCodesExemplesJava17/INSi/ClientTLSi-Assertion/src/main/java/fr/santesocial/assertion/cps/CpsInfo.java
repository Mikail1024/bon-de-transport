/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion.cps;

import java.security.cert.X509Certificate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Les informations d'une CPS
 * 
 * @author GIE SESAM-VITALE - 2014
 *
 */
public class CpsInfo {
    /** Gestion des traces */
    private static final Logger log = LogManager.getLogger(CpsInfo.class);

    private long slot; // numero du slot contenant la CPS
    private String description; // description du slot (nom de la ressource)
    private String label; // label de la CPS (version + numero de serie)
    private String serialNumber; // token serial number
    private X509Certificate certificat; // certificat X509 de la CPS
    private String secteurActivite; // secteurActivite de la CPS
    private String codeSpecialite; // codeSpecialite de la CPS

    /**
     * Constructeur par d&eacute;faut
     */
    public CpsInfo() {
	slot = 0;
	description = null;
	label = null;
	serialNumber = null;
    }

    /**
     * Constructeur alternatif
     * 
     * @param cpsLibPath le chemin vers la cryptolib
     * @param slot       le numero du slot contenant la CPS
     * @param descr      la description du slot de la CPS (nom de ressource)
     * @param lab        le label de la CPS (version CPS + num&eacute;ro de
     *                   s&eacute;rie)
     * @param sn         le num&eacute;ro de s&eacute;rie physique de la CPS
     */
    public CpsInfo(String cpsLibPath, long slot, String descr, String lab, String sn) {
	this.slot = slot;
	this.description = descr;
	this.label = lab;
	this.serialNumber = sn;
	try {
	    this.certificat = Cps3Pkcs11.getInstance(cpsLibPath).getCertificate(slot);
	    this.secteurActivite = Cps3Pkcs11.getInstance(cpsLibPath).getSecteurActivite(slot);
	    this.codeSpecialite = Cps3Pkcs11.getInstance(cpsLibPath).getCodeSpecialite(slot);
	} catch (Exception e) {
	    log.error("erreur lecture certificat : ", e);
	    this.certificat = null;
	    this.secteurActivite = null;
	    this.codeSpecialite = null;
	}
    }

    /**
     * @return the slot
     */
    public long getSlot() {
	return slot;
    }

    /**
     * @param slot the slot to set
     */
    public void setSlot(long slot) {
	this.slot = slot;
    }

    /**
     * @return the description
     */
    public String getDescription() {
	return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
	this.description = description;
    }

    /**
     * @return the label
     */
    public String getLabel() {
	return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
	this.label = label;
    }

    /**
     * @return the serialNumber
     */
    public String getSerialNumber() {
	return serialNumber;
    }

    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(String serialNumber) {
	this.serialNumber = serialNumber;
    }

    /**
     * restitue le certificat X509 de la CPS
     * 
     * @return le certificat
     */
    public X509Certificate getCertificat() {
	return certificat;
    }

    /**
     * restitue le secteur d'activite de la CPS
     * 
     * @return le secteurActivite
     */
    public String getSecteurActivite() {
	return secteurActivite;
    }

    /**
     * restitue le codeSpecialite de la CPS
     * 
     * @return le codeSpecialite
     */
    public String getCodeSpecialite() {
	return codeSpecialite;
    }

}
