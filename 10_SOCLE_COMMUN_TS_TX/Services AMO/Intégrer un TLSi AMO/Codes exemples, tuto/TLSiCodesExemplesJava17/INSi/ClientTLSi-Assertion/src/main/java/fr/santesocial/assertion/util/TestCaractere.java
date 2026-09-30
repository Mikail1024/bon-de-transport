/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion.util;

/**
 * Permet de tester un type de caract&egrave;re
 * @author GIE SESAM-VITALE - 2014
 *
 */
public class TestCaractere {

	/**
	 * Teste si un caract&egrave;re est de type num&eacute;rique
	 * @param car le caract&egrave;re
	 * @return true si caract&egrave;re num&eacute;rique
	 */
	public static boolean IsNumerique(char car)
	{
		boolean ret = false;
		if( (car >= '0') && (car <= '9') )
			ret = true;
		return(ret);		
	} 
	        
	/**
	 * Teste si un caract&egrave;re est de type alphab&eacute;tique majuscule
	 * @param car le caract&egrave;re
	 * @return true si caract&egrave;re alphab&eacute;tique majuscule
	 */
	public static boolean IsAlphabetiqueMajuscule(char car)
	{
		boolean ret = false;
		if( (car >= 'A') && (car <= 'Z') )
			ret = true;
		return(ret);		
	}  

	/**
	 * Teste si un caract&egrave;re est de type alphab&eacute;tique minuscule
	 * @param car le caract&egrave;re
	 * @return true si caract&egrave;re alphab&eacute;tique minuscule
	 */
	public static boolean IsAlphabetiqueMinuscule(char car)
	{
		boolean ret = false;
		if( (car >= 'a') && (car <= 'z') )
			ret = true;
		return(ret);		
	}

	/**
	 * Teste si un caract&egrave;re est de type hexadecimal
	 * @param car le caract&egrave;re
	 * @return true si caract&egrave;re hexadecimal
	 */
	public static boolean IsHexadecimal(char car) {
		if(IsNumerique(car) == true)
			return true;
		
		if(IsAlphabetiqueMinuscule(car) == true) {
			if((car >= 'a') && (car <= 'f'))
				return true;
		}

		if(IsAlphabetiqueMajuscule(car) == true) {
			if((car >= 'A') && (car <= 'F'))
				return true;
		}
		
		return false;
	}
	
}
