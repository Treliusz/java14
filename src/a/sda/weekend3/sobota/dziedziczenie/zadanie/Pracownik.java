package a.sda.weekend3.sobota.dziedziczenie.zadanie;

public class Pracownik extends Person {

    double pensja;
    String wyksztalcenie;

    public Pracownik(String imie, String nazwisko, int wiek, double pensja, String wyksztalcenie){
        super(imie, nazwisko,wiek);
        this.pensja = pensja;
        this.wyksztalcenie = wyksztalcenie;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Pracownik{" +
                "pensja=" + pensja +
                ", wyksztalcenie='" + wyksztalcenie + '\'' +
                '}';
    }

    public double getPensja() {
        return pensja;
    }

    public String getWyksztalcenie() {
        return wyksztalcenie;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public void setWyksztalcenie(String wyksztalcenie) {
        this.wyksztalcenie = wyksztalcenie;
    }
}
