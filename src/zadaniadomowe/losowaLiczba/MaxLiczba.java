package zadaniadomowe.losowaLiczba;

import java.util.Scanner;

public class MaxLiczba {

    public static void main(String[] args) {

        int maxLiczba;
        System.out.println("Podaj maksymalną wylosowaną liczbę większą od 0");
        Scanner klawiatura = new Scanner(System.in);
        maxLiczba = klawiatura.nextInt();
        int wylosowanaLiczba = ((int) (Math.random() * (maxLiczba + 1)));
        System.out.println("Wylosowana liczba: " + wylosowanaLiczba);

    }
}
