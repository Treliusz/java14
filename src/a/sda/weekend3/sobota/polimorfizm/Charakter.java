package a.sda.weekend3.sobota.polimorfizm;

public abstract class Charakter implements WalczacaPostac {

    String imie;
    int wiek;
    double wzrost;
    String sila;
    String obrona;
    int moc;

    public Charakter(String imie, int wiek, double wzrost, String sila, String obrona, int moc){
        this.imie = imie;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.sila = sila;
        this.obrona = obrona;
        this.moc = moc;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    public double getWzrost() {
        return wzrost;
    }

    public String getSila() {
        return sila;
    }

    public String getObrona() {
        return obrona;
    }

    public int getMoc() {
        return moc;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setWzrost(double wzrost) {
        this.wzrost = wzrost;
    }

    public void setSila(String sila) {
        this.sila = sila;
    }

    public void setObrona(String obrona) {
        this.obrona = obrona;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }
}
