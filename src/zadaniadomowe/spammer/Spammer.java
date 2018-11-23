package zadaniadomowe.spammer;

import java.util.Scanner;

public class Spammer {

    String slowo;
    int iloscPowtorzen;

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Program wyświetla podane przez użytkownika słowo " +
                "w zadanej ilości\n");
        Spammer spamer = new Spammer();
        spamer.wprowadzSlowo();


    }
    public  void wyswietlSlowo(String slowo, int iloscPowtorzen){

        this.slowo = slowo;
        this.iloscPowtorzen = iloscPowtorzen;
        int porownaj = 0;
        do {
            System.out.println(slowo);
            porownaj++;
        } while (porownaj <= iloscPowtorzen);
    }
    public void wprowadzSlowo(){
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj słowo do wyświetlenia:");
        slowo = klawiatura.nextLine();
        System.out.println("Podaj ilość powtórzeń:");
        iloscPowtorzen = klawiatura.nextInt();
        wyswietlSlowo(slowo,iloscPowtorzen);

    }
}
