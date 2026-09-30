/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion.util;

import java.nio.charset.Charset;

import fr.santesocial.mica.jnamica.output.ByteArray;

/**
 * Permettant de convertir diff&eacute;rentes donn&eacute;es
 * 
 * @author GIE SESAM-VITALE - 2014
 *
 */
public class Conversion {

    private final static Charset UTF8_CHARSET = Charset.forName("UTF-8");

    /**
     * Convertit un buffer d'octets en ASCII
     * 
     * @param byteArray : Buffer d'octets
     * @param iLg       : Longueur du buffer d'octets
     * @return Le buffer convertit en ASCII sous forme de String
     */
    public static String BufToAscii(ByteArray byteArray, int iLg) {
	String sAscii = new String();
	String sTemp;

	for (int i = 0; i < iLg; i++) {
	    sTemp = ByteToAscii(byteArray.getByte(i));
	    sAscii += sTemp;
	}

	return sAscii;
    }

    /**
     * Convertit un octet en ASCII
     * 
     * @param b l'octet
     * @return l'octet en ASCII sous forme de String
     */
    public static String ByteToAscii(byte b) {
	int value = b & 0xFF;
	if (value < 0x10) {
	    return "0" + Integer.toHexString(value).toUpperCase();
	}

	return Integer.toHexString(value).toUpperCase();
    }

    /**
     * Convertit un Short en ASCII
     * 
     * @param snb le Short
     * @return le short en ASCII sous forme de String
     */
    public static String ShortToBufAscii(short snb) {
	String sBuf = new String();
	ByteArray byteArray = new ByteArray(2);

	byteArray = ShortToBufHexa(snb);
	sBuf = BufToAscii(byteArray, 2);

	return sBuf;
    }

    /***
     * Convertit un short en Hexa
     * 
     * @param snb le short
     * @return le short en Hexa sous forme de tableau de 2 octets
     */
    public static ByteArray ShortToBufHexa(short snb) {

	ByteArray sBuf = new ByteArray(2);

	byte s0 = (byte) (snb >> 8);
	byte s1 = (byte) (snb & 0x00FF);

	sBuf.setByte(0, s0);
	sBuf.setByte(1, s1);

	return sBuf;
    }

    /**
     * Convertit les 2 premiers octets d'un buffer hexa en short
     * 
     * @param baBytes : Buffer d'octets
     * @return un short
     */
    public static short BufHexaToShort(ByteArray baBytes) {
	short nb = 0;

	short msb = baBytes.getByte(1);
	short lsb = baBytes.getByte(0);

	if (msb < 0)
	    msb = (short) (0x100 + msb);
	if (lsb < 0)
	    lsb = (short) (0x100 + lsb);

	nb = (short) (msb + (lsb * 0x100));
	return (nb);
    }

    /**
     * Convertir les 4 premiers octets d'un buffer hexa en long
     * 
     * @param baBytes : Buffer d'octets
     * @return un long
     */
    public static long BufHexaToLong(ByteArray baBytes) {
	long nb = 0;

	long oct1 = (long) baBytes.getByte(3);
	long oct2 = (long) baBytes.getByte(2);
	long oct3 = (long) baBytes.getByte(1);
	long oct4 = (long) baBytes.getByte(0);

	if (oct1 < 0)
	    oct1 = (long) (0x100 + oct1);
	if (oct2 < 0)
	    oct2 = (long) (0x100 + oct2);
	if (oct3 < 0)
	    oct3 = (long) (0x100 + oct3);
	if (oct4 < 0)
	    oct4 = (long) (0x100 + oct4);

	nb = oct1 + (oct2 * 0x100) + (oct3 * 0x10000) + (oct4 * 0x1000000);

	return (nb);
    }

    /***
     * Convertit un long en Hexa
     * 
     * @param lValue le long
     * @return le long en Hexa sous forme de tableau de 2 octets
     */
    public static ByteArray LongToBufHexa(Long lValue) {
	ByteArray sBuf = new ByteArray(4);
	sBuf.setByte(3, (byte) (lValue & 0x0FF));
	sBuf.setByte(2, (byte) (lValue >> 8));
	sBuf.setByte(1, (byte) (lValue >> 16));
	sBuf.setByte(0, (byte) (lValue >> 24));
	return sBuf;
    }

    /**
     * Convertit une chaine de caract&egrave;res en hexa
     * 
     * @param sValue La chaine
     * @return la chaine en hexa sous forme de tableau d'octets
     */
    public static ByteArray StringToHexa(String sValue) {
	int iLongueur = sValue.length();
	if (IsPair(iLongueur) == false) {
	    sValue = "0" + sValue;
	    iLongueur++;
	}
	ByteArray sBuf = new ByteArray(iLongueur / 2);

	byte lsb = 0x00;
	short msb = 0x00;
	byte bSoustraitM = 0, bSoustraitL = 0;

	for (int i = 0, j = 0; i < iLongueur; i++, j++) {
	    if (TestCaractere.IsNumerique(sValue.charAt(i)))
		bSoustraitM = 0x30;
	    else if (TestCaractere.IsAlphabetiqueMajuscule(sValue.charAt(i)))
		bSoustraitM = 0x37;
	    else if (TestCaractere.IsAlphabetiqueMinuscule(sValue.charAt(i)))
		bSoustraitM = 0x57;
	    msb = (byte) (sValue.charAt(i) - bSoustraitM);

	    if (TestCaractere.IsNumerique(sValue.charAt(i + 1)))
		bSoustraitL = 0x30;
	    else if (TestCaractere.IsAlphabetiqueMajuscule(sValue.charAt(i + 1)))
		bSoustraitL = 0x37;
	    else if (TestCaractere.IsAlphabetiqueMinuscule(sValue.charAt(i + 1)))
		bSoustraitL = 0x57;
	    lsb = (byte) (sValue.charAt(i + 1) - bSoustraitL);

	    byte total = (byte) ((msb << 4) + lsb);
	    sBuf.setByte(j, total);

	    i++;
	}

	return sBuf;
    }

    /**
     * Teste si un nombre est pair
     * 
     * @param nombre le nombre à tester
     * @return true si le nombre est pair, false sinon
     */
    private static boolean IsPair(int nombre) {
	if ((nombre % 2) == 0)
	    return true;
	return false;
    }

    /**
     * Convertit un tableau d'octets en String
     * 
     * @param byteArray tableau d'octets
     * @param lg        longueur du tableau
     * @return une string
     */
    public static String BufToString(ByteArray byteArray, int lg) {
	char car;
	byte byteValue;
	String sValue = "";
	for (int i = 0; i < lg; i++) {
	    byteValue = byteArray.getByte(i);
	    if (byteValue == 0)
		continue;
	    car = (char) byteValue;
	    sValue += car;
	}
	return sValue;
    }

    /**
     * Convertit une partie d'un tableau d'octets en String
     * 
     * @param baData : Buffer d'octets
     * @param iDebut l'index de début dans le tableau
     * @param iLongueur la longueur d'octets converti
     * @return une string
     */
    public static String BufToString(ByteArray baData, int iDebut, int iLongueur) {
	char car;
	String sValue = "";
	for (int i = iDebut; i < iDebut + iLongueur; i++) {
	    if (baData.getByte(i) != 0) {
		if (baData.getByte(i) < 0)
		    car = (char) (0x100 + (char) baData.getByte(i));
		else
		    car = (char) baData.getByte(i);
		sValue += car;
	    }
	}
	return sValue;
    }

    /**
     * Convertit une chaine ASCII Hexa en short
     * 
     * @param stringValue la valeur à convertir
     * @return un short
     */
    public static short AsciiHexaToShort(String stringValue) {
	short sValue = 0;

	int cpt1, cpt2, cpt3, fact;
	byte quar = 0;

	int nbCar = stringValue.length();
	for (cpt1 = (nbCar - 1), cpt2 = 0; cpt1 >= 0; cpt1--, cpt2++) {
	    if (TestCaractere.IsNumerique(stringValue.charAt(cpt1)))
		quar = (byte) (stringValue.charAt(cpt1) - 0x30);
	    if (TestCaractere.IsAlphabetiqueMajuscule(stringValue.charAt(cpt1)))
		quar = (byte) (stringValue.charAt(cpt1) - 0x37);
	    if (TestCaractere.IsAlphabetiqueMinuscule(stringValue.charAt(cpt1)))
		quar = (byte) (stringValue.charAt(cpt1) - 0x57);
	    fact = 1;
	    for (cpt3 = 0; cpt3 < cpt2; cpt3++)
		fact *= 0x10;
	    sValue += quar * fact;
	}

	return sValue;
    }

    /**
     * Convertit une tableau de byte en String Hexa
     * 
     * @param b tableau de byte
     * @return un String
     */
    public static String getHexString(byte[] b) {
	String result = "";
	for (int i = 0; i < b.length; i++) {
	    result += Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1);
	}
	return result;
    }

    /**
     * Décode un tableau de bytes en UTF-8
     * 
     * @param bytes le tableau de bytes
     * @return la chaîne en UTF-8 obtenue
     */
    public static String decodeUTF8(byte[] bytes) {
	return new String(bytes, UTF8_CHARSET);
    }

    /**
     * Encode une chaîne en UTF-8 en tableau de bytes
     * 
     * @param string la chaîne en UTF-8
     * @return le tableau de bytes
     */
    public static byte[] encodeUTF8(String string) {
	return string.getBytes(UTF8_CHARSET);
    }
}
