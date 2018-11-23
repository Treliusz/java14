package zadaniadomowe.enumy.karty;

public class Karty {

    public enum Kolor {KIER, KARO, TREFL, PIK}
    public enum Figura {AS, KROL, DAMA, WALET}

    public static void drukujOpisKarty(){
        for (int i=0; i<Figura.values().length; i++){
            for (int j=0; j<Kolor.values().length; j++){
                System.out.println(Figura.values()[i] + " " +
                        Kolor.values()[j].toString().toLowerCase());
            }
        }
    }
    public static void main(String[] args) {
        drukujOpisKarty();
    }
}
