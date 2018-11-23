package a.sda.weekend3.sobota.polimorfizm;

public class Wojownik extends Charakter {

    public Wojownik(String imie, int wiek, double wzrost, String sila, String obrona, int moc){
        super(imie,wiek,wzrost,sila,obrona,moc);
    }

    @Override
    public String toString() {
        return "Wojownik{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", wzrost=" + wzrost +
                ", sila='" + sila + '\'' +
                ", obrona='" + obrona + '\'' +
                ", moc=" + moc +
                '}';
    }

    @Override
    public void walcz() {
        System.out.println("Walczę pięściami");

    }
}
