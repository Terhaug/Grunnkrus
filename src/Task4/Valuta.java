package Task4;

public class Valuta {
    public String navn;
    public double kurs;

    public Valuta(String navn, double kurs){
        this.navn = navn;
        this.kurs = kurs;

    }

    public void setKurs(double kurs) {
        this.kurs = kurs;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getNavn(){
        return navn;
    }

    public double getKurs() {
        return kurs;
    }

    public double RegnOmTilNok(double antall){
        double nok = 0;
        if(antall >= 0){
             nok = antall*kurs;
        }else{
            System.out.println("negativt antall vil jeg ikke ha");
        }
        return nok;
    }

}

