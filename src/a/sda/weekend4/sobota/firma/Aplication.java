package a.sda.weekend4.sobota.firma;

import a.sda.weekend4.sobota.firma.writer.PracownikWriter;
import a.sda.weekend4.sobota.firma.writer.TxtPracownikWriter;
import a.sda.weekend4.sobota.firma.writer.WriterFactory;
import a.sda.weekend4.sobota.firma.writer.XmlPracownikWriter;

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
                   // firma.wyswietlPracownikow();
                    wyswietlPracownikow(firma);
                    break;
                }
                case 2:
                {
                    wstawPracownika(firma);

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
                    System.out.println("Podaj nazwę pliku:");
                    String fileName = scanner.next();


                    PracownikWriter writer = WriterFactory.createWriter(fileName);
                    if (writer != null){
                        writer.write(firma.getTabPracownikow());
                    } else
                        System.out.println("Nie obsługiwane rozszerzenie");

                    //firma.zapiszDoPliku();
                    break;
                }
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void wyswietlPracownikow(Firma firma) {
        System.out.println("Lista pracowników");
        for(int i=0; i<firma.getTabPracownikow().length; i++) {
            System.out.println(firma.getTabPracownikow()[i]);
        }
        return;
    }

    private static void wstawPracownika(Firma firma) {
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
//        firma.dodajPracownika(pracownik1);
//        firma.dodajPracownikaDoTablicy(pracownik1);
        boolean wynik = firma.dodajPracownikaDoTablicy(pracownik1);
        if(wynik){
            System.out.println("Dodano nowego pracownika");
        } else System.out.println("Nie udało się dodać nowego pracownika");
        //To samo co wyżej:
        String message = wynik == true
                ?"Dodano nowego pracownika" : "Nie udało się dodac nowego pracownika";
        System.out.println(message);
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
