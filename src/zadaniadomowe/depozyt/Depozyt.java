package zadaniadomowe.depozyt;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Depozyt {

    static double kapital;
    static int miesiace;
    static double oprocentowanie;
    static double odsetki;
    static double suma;

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        NumberFormat format = new DecimalFormat("#0.00");
        Depozyt bank = new Depozyt();
        System.out.println("Podaj kwotę lokaty:");
        kapital = klawiatura.nextDouble();
        System.out.println("Podaj ilość miesięcy lokaty:");
        miesiace = klawiatura.nextInt();
        System.out.println("Podaj wysokość oprocentowania rocznego w %:");
        oprocentowanie = klawiatura.nextDouble();

        System.out.print("Symulacja lokaty na " + miesiace);

        switch (miesiace) {
            case 1:
                System.out.println(" miesiąc:");
                break;
            case 2: case 21: case 22: case 23: case 24:
            case 3: case 31: case 32: case 33: case 34:
            case 4: case 41: case 42: case 43: case 44:
                System.out.println(" miesiące:");
                break;
            default:
                System.out.println(" miesięcy:");
        }

        System.out.println("-------------------------------");
        System.out.println("Kapitał: " + " " + format.format(kapital) + " zł");
        System.out.println("Odsetki: " + " " + " " + " " + format.format(bank.odsetkiMiesieczne()) + " zł");
        System.out.println("-------------------------------");
        System.out.println("Suma: " + " " + " " + " " + " " + format.format((kapital + odsetki)) + " zł");
    }
    public double odsetkiMiesieczne(){
        odsetki = kapital * oprocentowanie / 100 / 12 * miesiace;
        return odsetki;
    }
}
