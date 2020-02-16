package Task4;

public class KlientProgram {
    public static void main(String[] args) {
        Valuta EUR = new Valuta("Euro", 10.20);
        Valuta DOLLAR = new Valuta("Dollar", 9.85);
        Valuta SEK = new Valuta("Svenske kroner", 0.95);
        double antall = 11.2;

        System.out.println("Beregner hvor mye " + antall + "NOK er i Euro, Dollar og Sek");
        System.out.println("--------------------------------------------------------------------");
        String eNavn = EUR.getNavn();
        double eNOK = EUR.RegnOmTilNok(antall);

        String dNavn = DOLLAR.getNavn();
        double dNOK = DOLLAR.RegnOmTilNok(antall);

        String sNavn = SEK.getNavn();
        double sNOK = SEK.RegnOmTilNok(antall);

        System.out.println(eNavn +" :" + antall + " gir " + eNOK + " norske Kroner" + "\n" +
                dNavn +" :" + antall + " gir " + dNOK + " norske Kroner" + "\n" +
                sNavn + " :" + antall + " gir " + sNOK + " norske Kroner" + "\n");
    }
}