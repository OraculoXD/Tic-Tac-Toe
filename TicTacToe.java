import java.util.Scanner;

/**
 * A simple Tic-Tac-Toe game.
 * 
 * @autor gabriel.almeida98@edu.pucrs.br
 * @version 2022-06-08
 */
class TicTacToe {
    /**
     * Initialize a new board.
     * 
     * @return a 3x3 board
     */
    public static String[][] init() {
        String[][] board = new String[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = " ";
            }
        }
        return board;
    }

    /**
     * Returns a string with a board representation.
     * 
     * @param board a 3x3 board
     */
    public static String display(String[][] board) {
        String r = "";
        System.out.println("  012");
        for (int i = 0; i < board.length; i++) {
            r += i + "|";
            for (int j = 0; j < board[i].length; j++) {
                r += board[i][j];
            }
            r += "|\n";
        }
        return r;
    }

    public static void set(String[][] b, int i, int j, String p) {
        if (b[i][j].equals(" ")) {
            b[i][j] = p;
        }
    }

    public static void main(String[] args) {
        Scanner sc;
        String [][] board;
        String player = "x";
        int i, j;

        System.out.println("Jogo da Velha!");
        board = init();
        sc = new Scanner(System.in);
        while (true) {
            System.out.println(display(board));
            i =sc.nextInt();
            if (i < 0) 
                break;
            j = sc.nextInt();
            
            set(board, i, j, player);
            
            if(player.equals("x")) {
                player = "o";
            } else {
                player = "x";
            }
        }
        sc.close();
    }
}