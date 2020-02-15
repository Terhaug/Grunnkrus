package Task1;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Hour_Min_Sec_intoSec {
    public static void main(String[] args) {
        int AmHours = parseInt(showInputDialog("Amount of hours"));
        int AmMin = parseInt(showInputDialog("Amount of minutes"));
        int AmSec = parseInt(showInputDialog("Amount of seconds"));
        int TotSec = (AmHours*60*60)+(AmMin*60)+AmSec;

        showMessageDialog(null, AmHours + " hours, " + AmMin + " minutes, " + AmSec + " seconds, = " + TotSec);

    }
}
