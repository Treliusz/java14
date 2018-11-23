package zadaniazheliona;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PoleProstokata {
    public static void main(String[] args)
    throws IOException
    {

        double a,b,pole;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program oblicza pole prostokąta");
        System.out.println("Podaj bok a:");
        a = Double.parseDouble(br.readLine());
        System.out.println("Podaj bok b:");
        b = Double.parseDouble(br.readLine());

        pole = a * b;

        System.out.println("Pole prostokąta o boku a = " + a + " oraz boku b = " + b + " wynosi: " + pole);
    }
}
