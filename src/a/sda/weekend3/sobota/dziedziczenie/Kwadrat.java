package a.sda.weekend3.sobota.dziedziczenie;


public class Kwadrat extends Kształt {


    @Override
    public double obliczPole(int a) {
        pole = a * a;
        return pole;
    }

    @Override
    public double obliczObwod(int a) {
        obwod = 4 * a;
        return obwod;
    }
}

