package othertasks.tictactoe;

public class TicTacToe {

    public static final int O = -1, X = 1, EMPTY = 0;
    public int player = X;
    private int[][] tab = new int[3][3];
    public boolean isEmpty = false;

    public void putSing(int x, int y) {
        if (x < 0 || x > 2 || y < 0 || y > 2) {
            System.out.println("Nieprawidłowa pozycja");
            return;
        }
        if (tab[x][y] != EMPTY) {
            System.out.println("Ta pozycja jest już zajęta");
            return;
        } else {
            tab[x][y] = player;
            player = -player;
        }
    }

    public boolean isWin(int player) {
        return ((tab[0][0] + tab[0][1] + tab[0][2]) == 3 * player ||
                (tab[1][0] + tab[1][1] + tab[1][2]) == 3 * player ||
                (tab[2][0] + tab[2][1] + tab[2][2]) == 3 * player ||
                (tab[0][0] + tab[1][0] + tab[2][0]) == 3 * player ||
                (tab[0][1] + tab[1][1] + tab[2][1]) == 3 * player ||
                (tab[0][2] + tab[1][2] + tab[2][2]) == 3 * player ||
                (tab[0][0] + tab[1][1] + tab[2][2]) == 3 * player ||
                (tab[0][2] + tab[1][1] + tab[2][0]) == 3 * player);
    }

    public void displayWinner() {
        if (isWin(X)) {
            System.out.println("Wygrywa X");
        }
        if (isWin(O)) {
            System.out.println("Wygrywa O");
        } else {
            if (!isEmpty) {
                System.out.println("Remis");
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        isEmpty = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (tab[i][j]) {
                    case X:
                        sb.append(" X ");
                        break;
                    case O:
                        sb.append(" O ");
                        break;
                    case EMPTY:
                        sb.append("   ");
                        isEmpty = true;
                        break;
                }
                if (j < 2) {
                    sb.append("|");
                    break;
                }
            }
            if (i < 2) {
                sb.append("\n-----------\n");
                break;
            }
        }
        return sb.toString();
    }

}
