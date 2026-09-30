/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion.commun;

/**
 * Exception dans la cr&eacute;ation d'une Assertion SAML.
 * 
 * @author GIE SESAM VITALE - 2014
 * 
 */

public class AssertionException extends Exception {
    /**
     * UUID
     */
    private static final long serialVersionUID = 5193497609129264112L;

    public AssertionException() {
	super();
    }

    public AssertionException(String arg0, Throwable arg1) {
	super(arg0, arg1);
    }

    public AssertionException(String arg0) {
	super(arg0);
    }

    public AssertionException(Throwable arg0) {
	super(arg0);
    }

}
