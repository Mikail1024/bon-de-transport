/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion.cps;

import java.awt.Color;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * Fen&ecirc;tre de saisie du code porteur de la CPS
 * 
 * @author GIE SESAM-VITALE - 2014
 * 
 */
public class DialogSaisieCodePorteur extends JDialog {

    /**
     * UUID
     */
    private static final long serialVersionUID = -443881602212166925L;
    private JPasswordField passwordField;
    private JButton btnAnnuler;
    private JButton btnOk;
    private JLabel lblCodePorteurError;
    private String codePorteur;

    /**
     * Cr&eacute;ation de la fen&ecirc;tre de saisie
     */
    public DialogSaisieCodePorteur() {
	super();
	this.setModal(true);
	this.setTitle("Identification CPS");
	this.setSize(225, 165);
	this.setResizable(false);
	this.setAlwaysOnTop(true);
	this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
	this.getContentPane().setLayout(null);
	Point point = new Point();
	point.x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getWidth()) / 2;
	point.y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getHeight()) / 2;
	this.setLocation(point);
	initialize();
    }

    /**
     * Initialise le contenu de la fenêtre.
     */
    private void initialize() {

	JLabel lblBienvenueDansProgisel = new JLabel("<html>Veuillez entrez votre code porteur.</html>");
	lblBienvenueDansProgisel.setBounds(10, 7, 222, 42);
	this.getContentPane().add(lblBienvenueDansProgisel);

	btnAnnuler = new JButton("Annuler");
	btnAnnuler.setBounds(20, 88, 80, 23);
	btnAnnuler.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		finDialog();
	    }
	});
	this.getContentPane().add(btnAnnuler);

	btnOk = new JButton("OK");
	btnOk.setBounds(114, 88, 80, 23);
	btnOk.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		if (passwordField.getPassword().length == 4
			&& ((Integer.valueOf(String.valueOf(passwordField.getPassword()))) >= 0)
			&& ((Integer.valueOf(String.valueOf(passwordField.getPassword()))) <= 9999)) {
		    codePorteur = String.valueOf(passwordField.getPassword());
		    finDialog();
		} else {
		    lblCodePorteurError.setVisible(true);
		    lblCodePorteurError.setText("Le format du code porteur est invalide (4 chiffres)");
		}
	    }
	});
	this.getContentPane().add(btnOk);

	passwordField = new JPasswordField();
	passwordField.setBounds(124, 52, 60, 20);
	passwordField.getDocument().addDocumentListener(new DocumentListener() {

	    public void removeUpdate(DocumentEvent e) {
		gestionTextField();
	    }

	    public void insertUpdate(DocumentEvent e) {
		gestionTextField();
	    }

	    public void changedUpdate(DocumentEvent e) {
		gestionTextField();
	    }

	    public void gestionTextField() {
		if (passwordField.getPassword().length < 4) {
		    passwordField.setBackground(Color.RED);
		} else {
		    passwordField.setBackground(Color.WHITE);
		}
	    }
	});
	passwordField.addKeyListener(new KeyListener() {

	    public void keyTyped(KeyEvent e) {
	    }

	    public void keyReleased(KeyEvent e) {
		if (passwordField.getPassword().length >= 4) {
		    e.consume();
		    char[] pwdTemp = { 't', 'e', 'm', 'p' };
		    for (int i = 0; i < 4; i++) {
			pwdTemp[i] = passwordField.getPassword()[i];
		    }
		    passwordField.setText(String.valueOf(pwdTemp));
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		    if (passwordField.getPassword().length == 4
			    && ((Integer.valueOf(String.valueOf(passwordField.getPassword()))) >= 0)
			    && ((Integer.valueOf(String.valueOf(passwordField.getPassword()))) <= 9999)) {
			codePorteur = String.valueOf(passwordField.getPassword());
			finDialog();
		    } else {
			lblCodePorteurError.setVisible(true);
			lblCodePorteurError.setText("Le format du code porteur est invalide (4 chiffres)");
		    }
		}
	    }

	    public void keyPressed(KeyEvent e) {
	    }
	});
	this.getContentPane().add(passwordField);

	JLabel lblCodePorteur = new JLabel("Code porteur");
	lblCodePorteur.setBounds(25, 55, 75, 14);
	this.getContentPane().add(lblCodePorteur);

	lblCodePorteurError = new JLabel("test");
	lblCodePorteurError.setHorizontalAlignment(SwingConstants.CENTER);
	lblCodePorteurError.setForeground(Color.RED);
	lblCodePorteurError.setBounds(10, 110, 282, 14);
	lblCodePorteurError.setVisible(false);
	this.getContentPane().add(lblCodePorteurError);
	this.setFocusableWindowState(true);
	this.setFocusable(true);
	this.setAutoRequestFocus(true);
    }

    /**
     * Affiche la fen&ecirc;tre de saisie du code porteur et retourne le code
     * porteur saisi
     * 
     * @return Le code porteur de la CPS
     */
    public String showDialog() {
	this.setVisible(true);
	this.toFront();
	return this.codePorteur;
    }

    /**
     * Ferme la fenêtre de saisie
     */
    private void finDialog() {
	passwordField.setText("");
	lblCodePorteurError.setVisible(false);
	setVisible(false);
    }

    /**
     * Affiche un texte d'erreur
     * 
     * @param texteErreur Le texte &agrave; afficher dans le champ d'erreur
     */
    public void setTexteErreur(String texteErreur) {
	lblCodePorteurError.setText(texteErreur);
	lblCodePorteurError.setVisible(true);
    }
}
