package fr.sesamvitale.lps;

/********************************************************
 *  CopyRight....: GIE SESAM VITALE - 2021              *
 *  projet.......: ICIRv1                *
 *  Summary......: Appele au service ICIR *
 *  Date.........: 16 juillet 2021                     *
 ********************************************************/

public class AssertionException extends Exception {
	/**
	 * UUID
	 */
	private static final long serialVersionUID = -3928757398956524646L;

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
