package a.sda.weekend4.sobota;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ZapisDoPliku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst i zapisz do pliku");
        String tekst = scanner.nextLine();

        System.out.println("Podaj ścieżke do zapisu");
        String path = scanner.next();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))){
            writer.write(tekst);
        } catch (IOException e) {
            System.out.println("Nie udało osie zapisać do pliku");
        }
    }
}
