package zadaniadomowe.enumy.karty;

public class Karty2 {

    public enum Kolor{KIER, KARO, TREFL, PIK,}
    public enum Figura{AS, KROL, DAMA, WALET}
    Kolor kolor;
    Figura figura;

   public Karty2(Figura figura, Kolor kolor){
        this.kolor = kolor;
        this.figura = figura;
   }

    @Override
    public String toString() {
        return figura.toString() + " " + kolor.toString().toLowerCase();
    }

    public static void main(String[] args) {
       int licznik = 0;
        for (int i=0; i<Figura.values().length; i++){
            for (int j=0; j<Kolor.values().length; j++){
                Karty2 karty2 = new Karty2(Figura.values()[i], Kolor.values()[j]);
                licznik++;
                System.out.println(licznik + ". " +karty2);
            }
        }
    }
}
