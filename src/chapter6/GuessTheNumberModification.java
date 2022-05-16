package chapter6;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberModification {
    public static void main(String[] args) {
        playGame();

    }
    public static void playGame(){
        int count = 0;
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean status = true;
        int correctNumber = random.nextInt(1,1001);
        while (status){
            System.out.println("Guess a number between 1 and 1000: ");
            int userInput = input.nextInt();

            if(userInput > correctNumber){
                System.out.println("too high, try again");
            count += 1;}

            else if(userInput < correctNumber){
                System.out.println("too low, try again");
            count += 1;}


            else {
                if (count == 10){
                System.out.println("Aha! You know the secret!");
                }
                else if (count <= 10){
                System.out.println("Either you know the secret or you got lucky!");
                }
                else {
                System.out.println("You should be able to do better!");
                }
                status = false;
            }
        }
    }
}
