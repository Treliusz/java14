package zadaniadomowe.lokaty;

public class OfertaSpecjalna extends OfertaPodstawowa{


    public OfertaSpecjalna(double oprocentowanie, Kapitalizacja kapitalizacja) {
        super(oprocentowanie, kapitalizacja);

    }
    public double obliczZysk(double depozyt, int okres){
        for (int i=1; i<=okres; i++){
            zysk += depozyt * oprocentowanie/100/12;
            if(i%(Kapitalizacja.obliczMscKapitalicacji(kapitalizacja))!=0){
            } else {
                depozyt += zysk;
                zysk = 0;
            }
            if(i%12 == 0){
                oprocentowanie++;
            }
            if(oprocentowanie>10){
                oprocentowanie = 10;
            }
        }
        return depozyt + zysk;
    }

}
