package Task1;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class SecIntoHours {
    public static void main(String[] args) {
        int amSec = parseInt(showInputDialog("Amount of seconds"));
        int secLeft;

        int hours = amSec / 3600;
        secLeft = amSec % 3600;

        int min = secLeft / 60;
        secLeft = amSec % 60;

        int totSec = secLeft;
        if (amSec >= 0) {
            System.out.println(amSec + " = " + hours + " hours, " + min + " min, " + totSec + ", seconds");
        } else {
            System.out.println("You must enter a positive number of seconds");
        }
    }
}
