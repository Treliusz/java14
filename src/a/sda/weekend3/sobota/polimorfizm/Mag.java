package a.sda.weekend3.sobota.polimorfizm;

public class Mag extends Charakter {

    public Mag(String imie, int wiek, double wzrost, String sila, String obrona, int moc){
        super(imie,wiek,wzrost,sila,obrona,moc);
    }

    @Override
    public String toString() {
        return "Mag{" +
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
        System.out.println("Uderzam toporem");

    }
}
