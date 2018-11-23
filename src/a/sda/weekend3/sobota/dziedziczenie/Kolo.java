package a.sda.weekend3.sobota.dziedziczenie;

public class Kolo extends Kształt {



    @Override
    public double obliczPole(int a) {
        super.setPole(Math.PI * a * a);
        return pole;
    }

    @Override
    public double obliczObwod(int a) {
        super.setObwod(2 * Math.PI * a);
        return obwod;

    }
}
