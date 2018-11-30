package zadaniadomowe.lokaty;

public class OfertaPodstawowa {

    double oprocentowanie;
    Kapitalizacja kapitalizacja;
    double zysk = 0;

    public OfertaPodstawowa(double oprocentowanie, Kapitalizacja kapitalizacja) {
        this.oprocentowanie = oprocentowanie;
        this.kapitalizacja = kapitalizacja;
    }
    public double obliczZysk(double depozyt, int okres){
        for (int i=1; i<=okres; i++){
            zysk += depozyt * oprocentowanie/100/12;
            if(i%(Kapitalizacja.obliczMscKapitalicacji(kapitalizacja))!=0){

            } else {
                depozyt += zysk;
                zysk = 0;
            }
        }
        return depozyt + zysk;
    }

}
