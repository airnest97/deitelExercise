package assignment;

import java.security.SecureRandom;

public class DiceGameCraps {

    public static void main(String[] args) {

        crapGame();
    }

    private static void crapGame() {
        SecureRandom randomDice = new SecureRandom();

        int die1 = randomDice.nextInt(1, 7);
        int die2 = randomDice.nextInt(1,7);

        int sum = die1 + die2;
        int point;
        if(sum == 7 || sum == 11) {
            System.out.println(sum);
            System.out.println("Yay!!!! You Win");
        }
        else if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println(sum);
            System.out.println("Oh crap!! You Lose");
        }
        else if(sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10){
            point = sum;
            for (int i = 1; i != 0; i++) {
                die1 = randomDice.nextInt(1, 7);
                die2 = randomDice.nextInt(1, 7);

                System.out.println(sum);
                sum = die1 + die2;
                System.out.println("You get another turn, Please try again");

                if (sum == 7) {
                    System.out.println(sum);
                    System.out.println("Oh crap!! You Lose");
                    break;
                } else if (sum == point) {
                    System.out.println(sum);
                    System.out.println("Yay!!!! You Win");
                    break;
                }
            }
        }
    }
}


