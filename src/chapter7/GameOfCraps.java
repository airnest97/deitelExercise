package chapter7;

import java.security.SecureRandom;
import java.util.Arrays;

public class GameOfCraps {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        int[] winCount = new int[21];
        int[] loseCount = new int[21];
        for (int roll = 1; roll <= 1000000; roll++) {
            int count = 1;
            int points;
            int dice1 = secureRandom.nextInt(1, 7);
            int dice2 = secureRandom.nextInt(1, 7);
            if (dice1 + dice2 == 7 || dice1 + dice2 == 11) {
                winCount[0] = winCount[0] + 1;
            } else if ((dice1 + dice2 == 2) || (dice1 + dice2 == 3) || (dice1 + dice2 == 12)) {
                loseCount[0] = loseCount[0] + 1;
            } else if ((dice1 + dice2 == 4) || (dice1 + dice2 == 5) || (dice1 + dice2 == 6) || (dice1 + dice2 == 8) || (dice1 + dice2 == 9) || (dice1 + dice2 == 10)) {
                points = dice1 + dice2;
                while (count != -1) {
                    count += 1;
                    dice1 = secureRandom.nextInt(1, 7);
                    dice2 = secureRandom.nextInt(1, 7);
                    if (dice1 + dice2 == points) {
                        for (int i = 2; i <= 20; i++) {
                            if (count == i) {
                                winCount[i - 1] += 1;
                            }
                        }
                        if (count > 20) {
                            winCount[20] += 1;
                        }
                        break;

                    } else if (dice1 + dice2 == 7) {
                        for (int i = 2; i <= 20; i++) {
                            if (count == i) {
                                loseCount[i - 1] += 1;
                            }
                        }
                        if (count > 20) {
                            loseCount[20] += 1;
                        }
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(winCount));
        System.out.println(Arrays.toString(loseCount));
    }
}
