package barteczko.pliki;

import java.io.*;
import java.util.Scanner;

public class NumNumbers {
    public static void main(String[] args) {
        File f = new File("nums.txt");
        long sum = 0;
        String msg;
        try {
//            for(Scanner sc = new Scanner(f); sc.hasNextInt(); sum += sc.nextInt());
//            msg = "Suma " + sum;
//            Scanner scanner = new Scanner(f);
//            System.out.println(scanner.next().length() + " " + scanner.next().length());
            PrintWriter zapis = new PrintWriter("nums.txt");
            zapis.println("2 15 24 33 1");
            zapis.close();
            // Nadpisywanie do pliku
            Writer nadpis = new BufferedWriter( new FileWriter("nums.txt", true));
            nadpis.append("21 52 44 12 \n215 55 44 55");
            nadpis.close();
        } catch (Exception exc){
            msg = exc.toString();
        }
//        System.out.println(msg);
    }
}
