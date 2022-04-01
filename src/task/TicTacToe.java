package task;

public class TicTacToe {
    public static void main(String[] args) {
        String[][] game = new String[3][3];
        game[0][0] = "X ";
        game[0][1] = " O ";
        game[0][2] = " X ";
        game[1][0] = "X ";
        game[1][1] = " X ";
        game[1][2] = " X ";
        game[2][0] = "O ";
        game[2][1] = " X ";
        game[2][2] = " O ";

        System.out.println(game[0][0] + game[0][1] + game [0][2]);
        System.out.println(game[1][0] + game[1][1] + game[1][2]);
        System.out.println(game[2][0] + game[2][1] + game[2][2]);
    }
}
