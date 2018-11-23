package a.sda.weekend3.sobota.wyjatki;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        int dzielnik;
        int dzielna;
        int wynikDzielenia =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dzielną");
        dzielna = scanner.nextInt();
        System.out.println("Podaj dzielnik");
        dzielnik = scanner.nextInt();
        try {
            wynikDzielenia = podziel(dzielna, dzielnik);
        } catch (WyjatekDzieleniaPrzezZeroException exp){
            System.out.println(exp.getMessage());
            return;
        } catch (Exception exp){
            System.out.println("Nieznany błąd:" + exp.getMessage());
            return;
        }
        System.out.println("Wynik dzielenia: " + wynikDzielenia);

    }
    public static int podziel(int dzielna, int dzielnik) throws WyjatekDzieleniaPrzezZeroException{
        if(dzielnik == 0){
            throw new WyjatekDzieleniaPrzezZeroException("Nie wolno dzielić przez zero!");
        } else {
            return dzielna/dzielnik;
        }
    }
}

