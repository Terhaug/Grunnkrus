package Task3;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class GangeTabell {
    public static void main(String[] args) {
        int FraTab = parseInt(showInputDialog("Fra"));
        int tilTab = parseInt(showInputDialog("Til"));

        ArrayList<Integer> tabell = new ArrayList<>();
        for(int i = FraTab; i<tilTab +1; i++){
            tabell.add(i);
        }
        String res = " ";
        for(int k = 0; k<tabell.size(); k++){
            int tabNr = tabell.get(k);
            int produkt = 1;
            do{
                res += String.format("%dx%d = %d%n", tabNr, produkt, (tabNr * produkt));
                produkt++;
            }
            while(produkt <= 10);
        }
        System.out.println(res);
    }
}
