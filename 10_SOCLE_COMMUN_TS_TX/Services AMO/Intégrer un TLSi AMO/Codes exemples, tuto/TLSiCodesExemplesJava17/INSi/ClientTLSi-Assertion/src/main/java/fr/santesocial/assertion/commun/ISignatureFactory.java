/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion.commun;

/**
 * Interface de la fabrique de signature; impl&eacute;mentations : wrapper de la
 * pkcs11 CPS, wrapper MICA pour Vitale
 * 
 * @author GIE SESAM-VITALE - 2014
 *
 */
public interface ISignatureFactory {

    /**
     * Restitue l'&eacute;l&eacute;ment KeyInfo des donn&eacute;es de cl&eacute; de
     * signature de la fabrique
     * 
     * @return la liste des algorithmes
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public String getKeyInfo() throws AssertionException;

    /**
     * Restitue l'algorithme de signature de la fabrique
     * 
     * @return l'algorithme de signature
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public String getSignatureAlgorithm() throws AssertionException;

    /**
     * R&eacute;alise la signature
     * 
     * @param buf      le buffer de donn&eacute;es &agrave; signer
     * @param password le code d'autorisation de signature
     * @return le buffer contenant la signature
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public byte[] sign(byte[] buf, String password) throws AssertionException;
}
