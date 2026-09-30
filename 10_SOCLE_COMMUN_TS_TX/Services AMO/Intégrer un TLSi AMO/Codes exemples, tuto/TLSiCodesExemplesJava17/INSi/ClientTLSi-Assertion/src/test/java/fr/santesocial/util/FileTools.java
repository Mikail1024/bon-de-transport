/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileTools {
    private static final Logger log = LogManager.getLogger(FileTools.class);
    /**
     * Copie le fichier source dans le fichier resultat
     * 
     * @return vrai si cela réussit
     */
    public static boolean copyFile(String source, String dest) {
	try (FileChannel in = new FileInputStream(source).getChannel();
		FileChannel out = new FileOutputStream(dest).getChannel()) {
	    // Copie depuis le in vers le out
	    in.transferTo(0, in.size(), out);
	    return true; // Résultat OK
	} catch (Exception e) {
	    log.error(e);
	    return false;
	}
    }

    /**
     * Supprime un répertoire et tout son contenu
     * 
     * @param path le chemin du répertoire
     * @return true si OK
     */
    static public boolean deleteDirectory(File path) {
	boolean resultat = true;

	if (path.exists()) {
	    File[] files = path.listFiles();
	    for (int i = 0; i < files.length; i++) {
		if (files[i].isDirectory()) {
		    resultat &= deleteDirectory(files[i]);
		} else {
		    resultat &= files[i].delete();
		}
	    }
	}
	resultat &= path.delete();
	return (resultat);
    }

    /**
     * Déplace et renomme un fichier vers un autre
     * 
     * @param source
     * @param destination
     * @return true si OK (false si fichier destination existe déjà)
     */
    public static boolean move(File source, File destination) {
	if (!destination.exists()) {
	    // On essaye avec renameTo
	    boolean result = source.renameTo(destination);
	    if (!result) {
		// On essaye de copier
		result = true;
		result &= copyFile(source.getAbsolutePath(), destination.getAbsolutePath());
		if (result)
		    result &= source.delete();

	    }
	    return (result);
	} else {
	    // Si le fichier destination existe, on annule ...
	    return (false);
	}
    }

}
