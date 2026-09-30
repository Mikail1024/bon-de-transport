/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion.vitale;

/**
 * Les informations d'une carte Vitale
 * 
 * @author GIE SESAM-VITALE - 2014
 *
 */
public class VitaleInfo {
    private String ressource;
    private String numSerie;

    /**
     * Construction VitaleInfo
     */
    public VitaleInfo() {
	ressource = null;
	numSerie = null;
    }

    /**
     * Construction VitaleInfo
     * 
     * @param ressource nom de la ressource lecteur Vitale
     * @param numSerie  le num&eacute;ro de s&eacute;rie de la carte Vitale
     */
    public VitaleInfo(String ressource, String numSerie) {
	this.ressource = ressource;
	this.numSerie = numSerie;
    }

    /**
     * @return le nom de la ressource du lecteur Vitale
     */
    public String getRessource() {
	return ressource;
    }

    /**
     * @param ressource le nom de la ressource du lecteur Vitale
     */
    public void setRessource(String ressource) {
	this.ressource = ressource;
    }

    /**
     * @return le num&eacute;ro de s&eacute;rie
     */
    public String getNumSerie() {
	return numSerie;
    }

    /**
     * @param numSerie le num&eacute;ro de s&eacute;rie
     */
    public void setNumSerie(String numSerie) {
	this.numSerie = numSerie;
    }

}
