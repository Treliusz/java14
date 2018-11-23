package a.sda.weekend3.sobota;

import java.util.Scanner;

public class Tablica {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj tekst:");
        String tekst = klawiatura.nextLine();
        char lastSing = tekst.charAt(tekst.length()-1);
        int licznik = 0;
        for (int i=0; i<tekst.length(); i++){
           if (lastSing == tekst.charAt(i)){
               licznik++;
            }
        }
        System.out.println("Ostatni znak: " + lastSing + " wystepuje " + licznik + " razy");


    }
}
