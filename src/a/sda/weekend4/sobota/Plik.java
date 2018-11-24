package a.sda.weekend4.sobota;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Plik {
    public static final String PATH_TO_FILE = "C:\\Users\\vmtr0\\OneDrive\\Programowanie\\Java\\SDA\\tekst.txt";
    public static void main(String[] args) {

        try {

            BufferedReader reader = new BufferedReader(new FileReader(PATH_TO_FILE ));
            String line;
            while ((line = reader.readLine()) != null)
            System.out.println(line);
        } catch (FileNotFoundException exp){
            System.out.println("Wyjątek " + exp.getLocalizedMessage());
            System.out.println(exp.getCause());
            System.out.println("\nPlik nie istnieje");
        } catch (Exception exp){
            exp.printStackTrace();
        }


    }
}
