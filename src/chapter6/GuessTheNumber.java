package chapter6;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
    playGame();

    }
    public static void playGame(){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean status = true;
        int correctNumber = random.nextInt(1,1001);
        while (status){
            System.out.println("Guess a number between 1 and 1000: ");
            int userInput = input.nextInt();

            if(userInput > correctNumber){
                System.out.println("too high, try again");}

            else if(userInput < correctNumber){
                System.out.println("too low, try again");}

            else {
                System.out.println("Congratulations! Would you like to play again? ");
                System.out.println("""
                    Enter:
                    1.-> play again
                    2.-> exit game
                    """);
                int userResponse = input.nextInt();
                switch (userResponse) {
                    case 1 -> playGame();
                    case 2 -> status = false;
                }
            }
        }
    }
}
