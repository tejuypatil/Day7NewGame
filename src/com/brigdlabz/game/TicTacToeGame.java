package com.brigdlabz.game;

public class TicTacToeGame {

    public static void main(String[] d) {
        char[] board={' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
        int index=1;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print("|"+index+" "+board[index]+" ");
                index++;
            }
            System.out.print("|");
            System.out.println("");
            System.out.println("--------------");
        }
    }
}