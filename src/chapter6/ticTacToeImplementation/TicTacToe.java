package chapter6.ticTacToeImplementation;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    private static final Scanner scan = new Scanner(System.in);
    private final Cell[][] array = new Cell[3][3];
    private final Player[] players ;
    private int playerTurn = 0;

    public TicTacToe(Cell status) {
        for (Cell[] cells : array) {
            Arrays.fill(cells, status);
        }

        players = new Player[2];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(i+1);
            players[i].setId(i+1);
        }
    }

    public void getCells(){
        for (Cell[] cells : array) {
            for (Cell cell: cells) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public Cell[][] getArray() {
        return array;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void markBoard(int row, int column, Cell tag) {
        if (array[row][column] == Cell.EMPTY){
            array[row][column] = tag;
        }
        else throw new IllegalArgumentException("Cell already marked");
    }

    public int checkWin(Cell cell) {
        if (array[0][0]== cell&&
                array[0][1] == cell &&
                array[0][2] == cell){
            return playerTurn;
        }
        else if (array[0][1]== cell &&
                array[1][1] == cell &&
                array[2][1] == cell){
            return playerTurn;
        }
        else if (array[0][2]== cell &&
                array[1][2] == cell &&
                array[2][2] == cell){
            return playerTurn;
        }
        else if (array[0][0]== cell &&
                array[1][0] == cell &&
                array[2][0] == cell){
            return playerTurn;
        }
        else if (array[1][0]== cell &&
                array[1][1] == cell &&
                array[1][2] == cell){
            return playerTurn;
        }
        else if (array[2][0]== cell &&
                array[2][1] == cell &&
                array[2][2] == cell){
            return playerTurn;
        }
        else if (array[0][2]== cell &&
                array[1][1] == cell &&
                array[2][0] == cell){
            System.out.println("Winner");
            return playerTurn;
        }
        else if (array[0][0]== cell &&
                array[1][1] == cell &&
                array[2][2] == cell){
            System.out.println("Winner");
            return playerTurn;
        }
        return 0;
    }

    public Cell takeTurns(Player playerOne, Player playerTwo) {
        playerTurn = (playerTurn == playerOne.getId())?
                playerTwo.getId(): playerOne.getId();
        if (playerTurn == 1) {
            return Cell.X;
        }else if (playerTurn == 2) {
            return Cell.O;
        }
        return Cell.EMPTY;
    }

    public int getPlayerTurn() {
        return playerTurn;
    }

    public void run(){
        Player one = new Player(1);
        Player two = new Player(2);
        for (int i = 0; i < 9; i++) {
            Cell cell = takeTurns(one, two);
            System.out.println("Enter row and column... abeg no put comma");
            int row = scan.nextInt();
            int column = scan.nextInt();
            try {
                markBoard(row, column, cell);
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Enter row and column... abeg no put comma");
                row = scan.nextInt();
                column = scan.nextInt();
                markBoard(row, column, cell);
            }
            getCells();
            int winner = checkWin(cell);
            if (winner == 1 || winner == 2){
                System.out.println("Player " + winner + " wins");
                return;
            }
        }
        System.out.println("No winner for this round");
    }
}
