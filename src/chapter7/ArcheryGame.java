package chapter7;

import java.security.SecureRandom;

public class ArcheryGame {
    public static void main(String[] args) {
        int[][] archeryGameScore = new int[4][4];

        SecureRandom random = new SecureRandom();

        for (int chances = 0; chances < archeryGameScore.length-1; chances++) {
            for (int player = 0; player < archeryGameScore[chances].length; player++) {
                archeryGameScore[chances][player] = random.nextInt(0,11);
            }
        }
        int largest = 0;
        int winner = 0;
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
               sum = sum + archeryGameScore[j][i];
            }
            archeryGameScore[3][i] = sum;
            if (archeryGameScore[3][i] > largest){
                largest = archeryGameScore[3][i];
                winner = (i+1);
            }
        }
        System.out.println("         Player1   Player2   player3   player4");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Chance %d ",(i+1));
            for (int j = 0; j < 4; j++) {
                System.out.printf("%5d    ",archeryGameScore[i][j]);
            }
            System.out.println();
        }
        System.out.println("============================================");
        System.out.print("Total        "+archeryGameScore[3][0]);
        for (int i = 1; i < 4; i++) {
            System.out.printf("%9d",archeryGameScore[3][i]);
        }
        System.out.println();
        System.out.print("============================================");
        System.out.println();
        System.out.printf("The winner is player %d scoring %d as total points",winner,largest);


    }
}
