package zadaniadomowe.szyfrolamacz;

import java.util.Scanner;

public class Szyfrolamacz {
    static int[] haslo = new int[4];
    static String yesOrNo;
    static int wylosowanaLiczba;
    static int liczbaUzytkownika;
    static boolean czyMamPdp = true;
    static int z;

    public static void main(String[] args) {
        losujHaslo();
        odgadnijHaslo();
    }
    static public void losujHaslo(){
        int x = 1000;
        wylosowanaLiczba = 0;
        for (int i=0; i<4; i++){
           haslo[i] = (int)(Math.random() *10);
           if (haslo[0] == 0) {
               haslo[0]=1;
           }
           wylosowanaLiczba += haslo[i]*x;
           x /= 10;
        }
    }
    static public void odgadnijHaslo(){
        System.out.println("\n" + wylosowanaLiczba);
        Scanner klawiatura = new Scanner(System.in);
        for (z=0; z<5;z++){
            podowiedzHaslo();
            System.out.println("Wprowadź 4 cyfrowe hasło");
            liczbaUzytkownika = klawiatura.nextInt();
            if (liczbaUzytkownika == wylosowanaLiczba){
                System.out.println("Hasło prawidłowe. Odgadłeś je w " + (z + 1) + " próbie.");
                z = 5;
            }else {
                if (liczbaUzytkownika > wylosowanaLiczba){
                    System.out.println("Wprowadzona liczba jest za duża\nPozostała ilość żyć: " + (4-z));
                } else {
                    System.out.println("Wprowadzona liczba jest za mała\nPoznostała ilość żyć: " + (4-z));
                }
            }
        }
        zapytajCoDalej();
        System.out.println("Wylosowane hasło to: " + wylosowanaLiczba + "\n\nKONIEC PROGRAMU");
    }
    static public void zapytajCoDalej(){
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Czy chcesz zagrać jeszcze raz? (y/n)");
        yesOrNo = klawiatura.next();
        if (yesOrNo.toLowerCase().equals("y")){
            czyMamPdp = true;
            losujHaslo();
            odgadnijHaslo();
        } else {
            System.out.println("\nDzięki za grę ;)");
        }
    }
    static public void podowiedzHaslo(){
        Scanner klawiatura = new Scanner(System.in);
        if (czyMamPdp == true){
            System.out.println("Czy chcesz podpowiedź do hasła? (y/n)");
            yesOrNo = klawiatura.next();
            if (yesOrNo.toLowerCase().equals("y")){
                czyMamPdp = false;
                System.out.println("Wprowadź, którą cyfrę z hasła mam odsłońić: 1,2,3 czy 4?");
                int cyfraHasla = klawiatura.nextInt();
                switch (cyfraHasla){
                    case 1:
                        System.out.println("Pierwsza cyfra hasła to: " + haslo[0]);
                        break;
                    case 2:
                        System.out.println("Druga cyfra hasła to : " + haslo[1]);
                        break;
                    case 3:
                        System.out.println("Trzecia cyfra hasła to: " + haslo[2]);
                        break;
                    case 4:
                        System.out.println("Czwarta  cyfra hasła to: " + haslo[3]);
                        break;
                        default:
                            System.out.println("Chyba coś sknociłeś i straciłeś jedyną możliwość podpowiedzi :(");
                }
            }else {
                if (yesOrNo.toLowerCase().equals("n")){
                    System.out.println("Ok, jak nie odgadniesz - zapytam Cię ponownie ;)");
                } else {
                    System.out.println("Nieprawidłowy znak. Spróbuj jeszcze raz");
                    podowiedzHaslo();
                }
            }

        }
    }

}
