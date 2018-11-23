package barteczko.pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetLines {
    public static void main(String[] args) {
        File plik = new File("tekst.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(plik);
        } catch (FileNotFoundException exp){
            System.out.println("Plik " + plik + " nie istnieje");
            return;
        }
        int lcount = 0;
        int strLenght = 0;
        while (scan.hasNextLine()){
            String line = scan.nextLine();
            lcount++;
            strLenght += line.length();
        }
        System.out.println("Liczna wierszy pliku: " + lcount);
        System.out.println("Łączna długość wierszy: " + strLenght);
    }
}
