package barteczko.wyjatki;

public class Dzielenie {
    public static void main(String[] args) {
        int a=1, b=0, c;
        String wynik;
        try {
            c=a/b;
            wynik = "" + c;
        }
        catch (ArithmeticException wyjatek){
            wynik ="***";
        }
        System.out.println(wynik);
    }
}
