package Task2;

public class Kilopris {
    public static void main(String[] args) {
        double prisA = 35.90;
        double gramA = 450;
        double prisB = 39.50;
        double gramB = 500;

        double prisPerGramA = prisA/gramA;
        double prisPerGramB = prisB/gramB;

        if(prisPerGramA > prisPerGramB){
            System.out.println("Kjøttdeig B er billigst");
        }else if(prisPerGramA < prisPerGramB ){
            System.out.println("Kjøttdeig A er billigst");
        }else{
            System.out.println("De er like billige");
        }
    }
}
