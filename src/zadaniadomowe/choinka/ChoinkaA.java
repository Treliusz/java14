package zadaniadomowe.choinka;

import java.util.Scanner;

public class ChoinkaA {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String znak;
        System.out.println("Podaj znak, z którego powstanie zadaniadomowe.choinka jednostronna:");
        znak = klawiatura.next();
        int poziom;
        System.out.println("Podaj ilość poziomów choinki");
        poziom = klawiatura.nextInt();

        for (int i = 0; i < poziom; i++){
            for (int x = 0; x < i + 1; x++){
                System.out.print(znak);
            }
            System.out.println();
        }
    }
}
