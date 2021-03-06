package a.sda.weekend3.sobota.polimorfizm;

public class Main {
    public static void main(String[] args) {
        WalczacaPostac postac = new Paladyn("Paladyn", 123, 178.6, "duża", "mocna", 5, false);
        System.out.println(postac.toString());
        postac.walcz();
        try {
            System.out.println(((Paladyn) postac).getTarcza());
        } catch (Paladyn.PaladynShieldException exp){
            System.out.println(exp.getMessage());
            return;
        }
        postac = new Wojownik("Wojownik", 43, 188.4, "średnia", "skuteczna", 4);
        System.out.println(postac.toString());
        postac.walcz();

        postac = new Mag("Mag", 283, 148, "mała", "przez zaskoczenie", 10);
        System.out.println(postac.toString());
        postac.walcz();
    }
}
