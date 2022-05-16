package chapter6;

import java.util.Random;

public class setOfRandomNumbersDisplay {
    public static void main(String[] args) {
       displayMultiplesOfThreeRandomNumbers();
       displayOneTwoFourEightAndMultiplesOfSixteenRandomNumbers();
       displayMultiplesOfTenRandomNumbers();
    }
    public static void displayMultiplesOfThreeRandomNumbers(){
        Random random = new Random();
        int y = random.nextInt(0, 13);
        if (y % 3 == 0) {
            System.out.println(y);
        }
        else displayMultiplesOfThreeRandomNumbers();
    }
    public static void displayOneTwoFourEightAndMultiplesOfSixteenRandomNumbers(){
        Random random = new Random();
        int y = random.nextInt(1, 33);
        if (y == 1 || y ==2 || y == 4 || y == 8 || y % 16== 0) {
            System.out.println(y);
        }
        else displayOneTwoFourEightAndMultiplesOfSixteenRandomNumbers();
    }
    public static void displayMultiplesOfTenRandomNumbers(){
        Random random = new Random();
        int y = random.nextInt(10, 41);
        if (y % 10 == 0) {
            System.out.println(y);
        }
        else displayMultiplesOfTenRandomNumbers();
    }
}
