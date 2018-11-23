package a.sda.weekend3.sobota.dziedziczenie;

public abstract class Kształt {
    protected double pole = 0;
    protected double obwod = 0;


    public abstract double obliczPole(int a);
    public abstract double obliczObwod(int a);


    public void setPole(double pole) {
        this.pole = pole;
    }

    public void setObwod(double obwod) {
        this.obwod = obwod;
    }

    public double getPole() {
        return pole;
    }

    public double getObwod() {
        return obwod;
    }

}
