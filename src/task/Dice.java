package task;

import java.security.SecureRandom;
import java.util.Arrays;

public class Dice {

    private static SecureRandom rand = new SecureRandom();

    public static void main(String[] args) {

        int [] player1 = new int [7];
        int [] player2 = new int [7];

        for (int i = 1; i < 200; i++) {
            rollDice(player1);
            rollDice(player2);
        }

        System.out.println("Player1: " + Arrays.toString(player1));
        System.out.println("Player2: " + Arrays.toString(player2));

    }

    private static void rollDice(int[] player){
        int face = rand.nextInt(1, 7);

        switch(face){
            case 1: player[1] = player[1] + 1;
            break;
            case 2: player[2] = player[2] + 1;
            break;
            case 3: player[3] = player[3] + 1;
            break;
            case 4: player[4] = player[4] + 1;
            break;
            case 5: player[5] = player[5] + 1;
            break;
            case 6: player[6] = player[6] + 1;
            break;
        }
    }
}
