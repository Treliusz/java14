package zadaniadomowe.wisielec;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    final static String UNKNOWN_LETTER = "*";
    private int healthPoints = 3;
    private String password;
    private String userInput = "";
    private int lineCounter = 0;
    File file = new File("passwords.txt");
    Random random = new Random();
    Scanner scanner = null;

    public Hangman(String password) {
        this.password = password.toLowerCase();
    }

    public Hangman() {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException exp) {
            System.out.println("Plik " + file + " nie istnieje");
        }

//        while (scanner.hasNextLine()) lineCounter++;
        lineCounter=25;

        System.out.println(lineCounter);

        String[] passTable = new String[lineCounter];
        for(int i=0; i<lineCounter; i++){
            passTable[i] = scanner.nextLine();
        }
        password = passTable[random.nextInt(lineCounter)].toLowerCase();

        System.out.println(password);

    }

    public boolean checkLetter(char letter) {
        userInput += Character.toLowerCase(letter);

        if (password.contains(String.valueOf(
                Character.toLowerCase(letter)
        ))) {
            System.out.println("Trafiłeś!");
            return true;
        } else {
            System.out.println("Pudło.");
            healthPoints--;
            if (isGameOver()) {
                System.out.println("Przegrałeś ;(");
            }
            return false;
        }

    }

    public String getBlurryPassword() {
        char[] letters = password.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < letters.length; i++) {
            if (userInput.contains(String.valueOf(letters[i]))) {
                sb.append(letters[i]);
            } else {
                sb.append(UNKNOWN_LETTER);
            }
        }

        return sb.toString();
    }

    public boolean isGameOver() {
        return healthPoints == 0 || getBlurryPassword().equals(password);
    }
}