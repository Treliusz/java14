package a.sda.weekend3.sobota.wyjatki;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int dzielnik = 0;
        int dzielna = 0;
        System.out.println("Podaj liczbę z zakresu od 20 do 50:");
        dzielnik = klawiatura.nextInt();
        System.out.println("Podaj liczbę z zakresu od 0 do 5:");
        dzielna = klawiatura.nextInt();
    }

    public static int podziel(int a, int b){
        if(a<20 && a>50){
            try {
                throw new LiczbaSpozaZakresu("Nie wolno dzielić przez zero");
            } catch (LiczbaSpozaZakresu liczbaSpozaZakresu) {
                liczbaSpozaZakresu.getMessage();
            }
        }else return a/b;

            return a/b;

    }
}
