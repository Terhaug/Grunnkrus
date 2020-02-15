package Task1;

import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;

public class FraTommeTIlCenti {
    public static void main(String[] args) {
        double tommePrefix = 2.54;
        double antTomme = parseDouble(showInputDialog("Antall tomme"));
        System.out.println(antTomme + " = " + antTomme*tommePrefix + " Centimeter");
    }

}