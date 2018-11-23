package zadaniadomowe.tablice;

import java.util.Scanner;

public class Tablica2 {
    public static void main(String[] args) {
        Scanner klawatura = new Scanner(System.in);

        tworzenieTabliy();



    }
    public static void tworzenieTabliy(){

        Scanner klawatura = new Scanner(System.in);
        int dlugoscTablicy;
        System.out.println("Podaj ilość elementów tablicy:");
        dlugoscTablicy = klawatura.nextInt();
        String znak;
        System.out.println("Czy chcesz wypełnić tablicę losowo? (y/n)");
        znak = klawatura.next();
        int[] tablica = new int[dlugoscTablicy];

        if ((znak.equals("y")) || (znak.equals("Y"))){
            for (int i = 0; i < dlugoscTablicy; i++){
                tablica[i] = (int) (Math.random() * 100);
            }
        }
        else {
            for (int i = 0; i < tablica.length; i++){
                System.out.println("Podaj " + (i + 1) + " element tablicy:");
                tablica[i] = klawatura.nextInt();
            }
        }
        Tablica.drukujOpisTablicy(tablica);
        System.out.println("Czy chcesz utworzyć nową tablicę? (y/n)");
        znak = klawatura.next();
        if (znak.equals("y"))
            tworzenieTabliy();
        else
            System.out.println("KONIEC PROGRAMU");
    }

}
