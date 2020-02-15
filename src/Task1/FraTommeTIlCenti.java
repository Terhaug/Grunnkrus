package Task1;

import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class FraTommeTIlCenti {
    public static void main(String[] args) {
        double tommePrefix = 2.54;
        double antTomme = parseDouble(showInputDialog("Antall tomme"));
        showMessageDialog(null,"antTomme" + " = " + antTomme*tommePrefix + " Centimeter");
    }

}