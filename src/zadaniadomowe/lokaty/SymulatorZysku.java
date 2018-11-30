package zadaniadomowe.lokaty;

import javax.sound.midi.Soundbank;
import java.util.Scanner;


public class SymulatorZysku {
    private static double depozyt;
    private static int okres;
    private static double oprocentowanie = 5;

    public static void pobierzDane(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwotę depozytu:");
        depozyt = scanner.nextDouble();
        System.out.println("Na jaki okres - ile miesięcy:");
        okres = scanner.nextInt();
    }

    public static void main(String[] args) {

        pobierzDane();
        System.out.println("Depozyt: " + depozyt + "\nIlość miesięcy: " + okres);
        System.out.println("\nOferta podstawowa. Oprocentowanie stałe: " + oprocentowanie + " %" );
        OfertaPodstawowa oferta1 = new OfertaPodstawowa(oprocentowanie,Kapitalizacja.MIESIECZNA);
        OfertaPodstawowa oferta2 = new OfertaPodstawowa(oprocentowanie, Kapitalizacja.KWARTALANA);
        OfertaPodstawowa oferta3 = new OfertaPodstawowa(oprocentowanie, Kapitalizacja.ROCZNA);
        System.out.printf("Kapitaliz. miesięczna:   %.2f",oferta1.obliczZysk(depozyt,okres));
        System.out.printf("\nKapitalizacja kwartalna: %.2f",oferta2.obliczZysk(depozyt,okres));
        System.out.printf("\nKapitalizacja roczna:    %.2f",oferta3.obliczZysk(depozyt,okres));
        System.out.println("\n\nOferta specjalna. Oprocentowanie zmienna: " + (oprocentowanie -1) + " %");
        OfertaPodstawowa oferta4 = new OfertaSpecjalna(oprocentowanie-1,Kapitalizacja.MIESIECZNA);
        OfertaPodstawowa oferta5 = new OfertaSpecjalna(oprocentowanie-1, Kapitalizacja.KWARTALANA);
        OfertaPodstawowa oferta6 = new OfertaSpecjalna(oprocentowanie-1, Kapitalizacja.ROCZNA);
        System.out.printf("\nKapitaliz. miesięczna:   %.2f",oferta4.obliczZysk(depozyt,okres));
        System.out.printf("\nKapitalizacja kwartalna: %.2f",oferta5.obliczZysk(depozyt,okres));
        System.out.printf("\nKapitalizacja roczna:    %.2f",oferta6.obliczZysk(depozyt,okres));



    }
}
