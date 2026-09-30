/********************************************************
 *  CopyRight....: GIE SESAM VITALE - 2021              *
 *  projet.......: ICIRv1                *
 *  Summary......: Appele au service ICIR *
 *  Date.........: 16 juillet 2021                     *
 ********************************************************/
package fr.sesamvitale.util;

/**
 * Permet de tester un type de caractère
 *
 */
public class TestCaractere {

	/**
	 * Test si un caractère est de type numérique
	 * @param car : Le caractère en entrée
	 * @return : true si caractère numérique
	 */
	public static boolean IsNumerique(char car)
	{
		boolean ret = false;
		if( (car >= '0') && (car <= '9') )
			ret = true;
		return(ret);		
	} 
	        
	/**
	 * Test si un caractère est de type alphabétique majuscule
	 * @param car : Le caractère en entrée
	 * @return : true si caractère alphabétique majuscule
	 */
	public static boolean IsAlphabetiqueMajuscule(char car)
	{
		boolean ret = false;
		if( (car >= 'A') && (car <= 'Z') )
			ret = true;
		return(ret);		
	}  

	/**
	 * Test si un caractère est de type alphabétique minuscule
	 * @param car : Le caractère en entrée
	 * @return : true si caractère alphabétique minuscule
	 */
	public static boolean IsAlphabetiqueMinuscule(char car)
	{
		boolean ret = false;
		if( (car >= 'a') && (car <= 'z') )
			ret = true;
		return(ret);		
	}

	/**
	 * Test si un caractère est de type hexadecimal
	 * @param car : Le caractère en entrée
	 * @return : true si caractère hexadecimal
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
