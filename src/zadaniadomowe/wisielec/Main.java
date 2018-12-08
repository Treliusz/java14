package zadaniadomowe.wisielec;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        Scanner scanner = new Scanner(System.in);

        while (!hangman.isGameOver()) {
            System.out.println("Podaj jedną literę hasła:");
            hangman.checkLetter(scanner.nextLine().charAt(0));
            System.out.println(hangman.getBlurryPassword());
        }
    }
}