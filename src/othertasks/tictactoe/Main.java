package othertasks.tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TicTacToe tTT = new TicTacToe();
        Scanner scanner = new Scanner(System.in);
        int x = 0, y = 0;
        do {
            System.out.println(tTT.player == tTT.X ? "\n\nPlayer X turn" : "\n\nPlayer O turn");
            System.out.println("Podaj pozycję x");
            x = scanner.nextInt();
            System.out.println("Podaj pozycję y");
            y = scanner.nextInt();

            for (int i = 0; i < 100; i++) {
                System.out.println();
            }
            tTT.putSing(x,y);
            System.out.println(tTT.toString());

            tTT.displayWinner();
        } while (tTT.isEmpty);
    }
}
