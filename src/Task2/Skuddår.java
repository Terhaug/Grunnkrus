package Task2;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Skuddår {
    public static void main(String[] args) {
        int årstall = parseInt(showInputDialog("Hvilket årstall?"));
        if(årstall < 0 ){
            System.out.println("Årstallet må være større enn null");
        }else if(årstall%4 == 0 || årstall%400 == 0){
            System.out.println("År "+årstall + " Er et skuddår");

        }else{
            System.out.println("År " + årstall + " Er ikke et skuddår");
        }

    }
}
