package zadaniadomowe.wisielec;
import java.util.Arrays;
import java.util.Scanner;

public class Wisielec {
    private static String hasloDlaPrzeciwnika;
    private static String literaUsera;
    private static Scanner klawiatura = new Scanner(System.in);

    public static void main(String[] args) {
        ustawHasloDlaPrzeciwnika();
        sprawdzWarunki();
    }
    public static void ustawHasloDlaPrzeciwnika(){
        System.out.println("Podaj hasło dla Przeciwnika:");
        hasloDlaPrzeciwnika = klawiatura.next();
    }
    public static void  podajLitere(){
        System.out.println("Podaj jedną literę z hasła:");
        literaUsera = klawiatura.next();
    }
    public static void sprawdzWarunki(){
        char[] tablicaHasla = new char[hasloDlaPrzeciwnika.length()];
        char[] tablicaOdgadywana = new char[hasloDlaPrzeciwnika.length()];
        char[] tablicaZeZnakiem = new char[1];
        for (int i=0; i<hasloDlaPrzeciwnika.length(); i++){
            tablicaOdgadywana[i] = '?';
        }
        for (int i=0; i<hasloDlaPrzeciwnika.length(); i++){
            tablicaHasla[i] = hasloDlaPrzeciwnika.charAt(i);
        }
        for (int i=0; i<5; i++){
            System.out.println("Ilość żyć: " + ((i * -1) + 5));
            for(char znak : tablicaOdgadywana)
                System.out.print(znak + " ");
            System.out.println("");
            podajLitere();
            if (literaUsera.length()>1){
                System.out.println("Miała być jedna litera\nKończysz grę jako PRZEGRANY");
                i = 5;
            }else {
                tablicaZeZnakiem[0] = literaUsera.charAt(0);
                for (int x=0; x<tablicaHasla.length; x++){
                    if ((tablicaHasla[x] == tablicaZeZnakiem[0])){
                        i--;
                        tablicaOdgadywana[x] = tablicaZeZnakiem[0];
                    }
                }
                if ((Arrays.toString(tablicaHasla)).equals(Arrays.toString(tablicaOdgadywana))){
                    System.out.println("Hasło odgadnięte\n" + hasloDlaPrzeciwnika);
                    i = 5;
                } else {
                    if (i == 4){
                        System.out.println("Tym razem się nie udało\nHasło to: " + hasloDlaPrzeciwnika);
                    }
                }
            }
        }
    }
}
