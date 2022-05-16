package chapter7;

import java.util.Arrays;
import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        int[] diceTableFrequency = new int[11];
        int count = 0;
        Random random = new Random();

        for (int i = 1; i <= 36000000; i++) {
            int dice1 = random.nextInt(1,7);
            int dice2 = random.nextInt(1,7);
            int sum = dice1 + dice2;
            diceTableFrequency[sum-2] += 1;
        }
        System.out.println("diceSum      frequency");
        for (int i = 0; i < diceTableFrequency.length; i++) {
            System.out.printf("%5d      %10d%n",(i+2),diceTableFrequency[i]);
        }
    }
}
