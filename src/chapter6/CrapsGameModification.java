package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsGameModification {
    private static int bankBalance = 1000;
    public static void main(String[] args) {
    wagerConfirmation();

    }
    public static void wagerConfirmation(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Wager: ");
        int wager = input.nextInt();
        if(wager > bankBalance){
            System.out.println("That's more than your bank balance! Reenter Wager: ");
            wagerConfirmation();
        }
        else playGame(wager);
    }
    public static void playGame(int wager){
        SecureRandom secureRandom = new SecureRandom();
        int points;
        int count = 0;
        int dice1 = secureRandom.nextInt(1, 7);
        int dice2 = secureRandom.nextInt(1, 7);
        System.out.println("first dice rolls " + dice1);
        System.out.println("second dice rolls " + dice2);
        if ((dice1 + dice2 == 7) || (dice1 + dice2 == 11)) {
            System.out.println("You win!");
            bankBalance = bankBalance + wager;
            System.out.println("Your new balance is "+bankBalance);
        }
        else if ((dice1 + dice2 == 2) || (dice1 + dice2 == 3) || (dice1 + dice2 == 12)) {
            System.out.println("craps, You lose!");

            bankBalance = bankBalance - wager;
            if(bankBalance == 0){
                System.out.println("Sorry. You are busted! You have no balance in your bank");
            }
            else
            System.out.println("Your new balance is "+bankBalance);
        }
        else if ((dice1 + dice2 == 4) || (dice1 + dice2 == 5) || (dice1 + dice2 == 6) || (dice1 + dice2 == 8) || (dice1 + dice2 == 9) || (dice1 + dice2 == 10)) {
            points = dice1 + dice2;
            while (count != -1) {
                int chatter = secureRandom.nextInt(1,4);
                displayChatter(chatter);
                dice1 = secureRandom.nextInt(1, 7);
                dice2 = secureRandom.nextInt(1, 7);
                System.out.println("first dice rolls " + dice1);
                System.out.println("second dice rolls " + dice2);
                if (dice1 + dice2 == points) {
                    System.out.println("You win!");
                    bankBalance = bankBalance + wager;
                    System.out.println("Your new balance is "+bankBalance);
                    break;
                } else if (dice1 + dice2 == 7) {
                    System.out.println("You lose!");
                    bankBalance = bankBalance - wager;
                    if(bankBalance == 0){
                        System.out.println("Sorry. You are busted! You have no balance in your bank");
                    }
                    else System.out.println("Your new balance is "+bankBalance);
                    break;
                }
                count++;
            }
        }
    }
    public static void displayChatter(int chatter){
        switch (chatter) {
            case 1 -> System.out.println("Oh, you're going for broke, huh?");
            case 2 -> System.out.println("Aw c'mon, take a chance!");
            case 3 -> System.out.println("You're up for a big win. Now's the time to cash in your chips!");
        }
    }
}
