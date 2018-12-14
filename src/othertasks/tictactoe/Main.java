package othertasks.tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TicTacToe tTT = new TicTacToe();
        Scanner scanner = new Scanner(System.in);
        int x = 0, y = 0;
        do {
            System.out.println(tTT.player == tTT.X ? "Player X turn" : "Player O turn");
            System.out.println("Podaj pozycję x");
            x = scanner.nextInt();
            System.out.println("Podaj pozycję y");
            y = scanner.nextInt();

            tTT.putSing(x,y);
            System.out.println(tTT.toString());
            System.out.println();
            System.out.println();
            System.out.println();
            tTT.displayWinner();
        } while (tTT.isEmpty);
    }
}
