package Collections;

import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = '-';
            }
        }

        board[0][0] = 'O';
        board[1][0] = 'O';
        board[2][0] = 'O';

        char[][] boardTwo = new char[][] {
                new char[] {'-', '-', '-'},
                new char[] {'-', '-', '-'},
                new char[] {'-', '-', '-'}
        };

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        for (char[] chars : board) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(chars[j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(boardTwo));
    }
}