package a.sda.weekend4.sobota.firma;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Aplication {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Firma firma = new Firma("sda");
        boolean czyWyjsc = false;
        while (!czyWyjsc) {
            printMenu();
            System.out.println("Wybór:");
            int wybor = scanner.nextInt();
            switch (wybor){
                case 1: {
                    firma.wyswietlPracownikow();
                    System.out.println("");
                } break;
                case 2:
                {
                    System.out.println("Podaj imię pracowniaka:");
                    String imie = scanner.next();
                    System.out.println("Podaj nazwisko:");
                    String nazwisko = scanner.next();
                    System.out.println("Podaj pensję:");
                    double pensja = scanner.nextDouble();
                    System.out.println("Podaj e-mail:");
                    String email = scanner.next();
                    System.out.println("Podaj id:");
                    int id = scanner.nextInt();
                    Pracownik pracownik1 = new Pracownik(imie, nazwisko, pensja, email, id);
                    firma.dodajPracownika(pracownik1);
                } break;
                case 3:{
                    System.out.println("Podaj imie:");
                    String imie = scanner.next();
                    System.out.println("Podaj nazwisko:");
                    String nazwisko = scanner.next();
                    Pracownik pracownik = new Pracownik(imie, nazwisko);
                    firma.usunPracownika(pracownik);
                } break;
                case 4:{
                    firma.wczytajPlik();
                    break;
                }
                case 5:{
                    firma.zapiszDoPliku();
                    break;
                }
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Menu");
        System.out.println("1. Wyświetl pracowników");
        System.out.println("2. Dodaj nowego pracownika");
        System.out.println("3. Usuń pracownika");
        System.out.println("4. Wczytaj z pliku");
        System.out.println("5. Zapisz do pliku");
        System.out.println("6. Wyjście");
    }
}
