package zadaniadomowe.kalkulator;

import java.util.Scanner;

public class Kalkulator {

    static String operator;
    static double pierwszaLiczba;
    static double drugaLiczba;
    static double wynik;

    public static void main(String[] args) {


        Kalkulator kalkulator = new Kalkulator();
        Scanner in = new Scanner(System.in);
        System.out.println("KALKULATOR");
        System.out.println("Podaj pierwszą liczbę:");
        pierwszaLiczba = in.nextDouble();
        System.out.println("Wybierz rodzaj operacji: + - * / %");
        operator = in.next();
        System.out.println("Podaj drugą liczbę:");
        drugaLiczba = in.nextDouble();

        switch (operator) {
            case "*":
                kalkulator.mnozenie();
                kalkulator.wydruk();
                break;
            case "+":
                kalkulator.dodawanie();
                kalkulator.wydruk();
                break;
            case "-":
                kalkulator.odejmowanie();
                kalkulator.wydruk();
                break;
            case "/":
                if (drugaLiczba != 0) {
                        kalkulator.dzielenie();
                        kalkulator.wydruk();
                }
                 else{
                         System.out.println("Dzielenie przez zero jest niepoprawne");
                        }
                break;
                case "%":
                kalkulator.modulo();
                kalkulator.wydruk();
                break;
                default:
                System.out.println("Nieprawidłowy operator");
                break;
            }

}


    public double mnozenie() {
        wynik = pierwszaLiczba * drugaLiczba;
        return wynik;
    }

    public double dodawanie() {
        wynik = pierwszaLiczba + drugaLiczba;
        return wynik;
    }

    public double odejmowanie() {
        wynik = pierwszaLiczba - drugaLiczba;
        return wynik;
    }

    public double dzielenie() {
        wynik = pierwszaLiczba / drugaLiczba;
        return wynik;
    }

    public double modulo() {
        wynik = pierwszaLiczba % drugaLiczba;
        return wynik;
    }

    public void wydruk() {
        if ((pierwszaLiczba % 1) == 0) {
            System.out.print((int) pierwszaLiczba + " " + operator + " ");
        } else {
            System.out.print(pierwszaLiczba + " " + operator + " ");
        }
        if ((drugaLiczba % 1) == 0) {
            System.out.print((int) drugaLiczba + " = ");
        } else {
            System.out.print(drugaLiczba + " = ");
        }
        if ((wynik % 1) == 0) {
            System.out.print((int) wynik);
        } else {
            System.out.print(wynik);
        }

    }

}
