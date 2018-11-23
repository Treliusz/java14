package zadaniadomowe.losowaLiczba;

import java.util.Scanner;

public class ZakresLiczbUjemne {

    public static void main(String[] args) {

        int minLiczba;
        int maxLiczba;
        int wylosowanaLiczba;
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbę minimalną");
        minLiczba = klawiatura.nextInt();
        System.out.println("Podaj liczbę maksymalną");
        maxLiczba = klawiatura.nextInt();
        wylosowanaLiczba = ((int)((Math.random() * (maxLiczba + (minLiczba * -1))) + minLiczba));
        System.out.println("Wylosowana liczba: " + wylosowanaLiczba);

    }
}
