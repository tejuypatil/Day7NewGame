package com.brigdlabz.game;

public class TicTacToeGame {

    public static void main(String[] d) {
        char[][] board={{' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '}};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(board[i][j]);

            }
            System.out.println();

        }
    }
}