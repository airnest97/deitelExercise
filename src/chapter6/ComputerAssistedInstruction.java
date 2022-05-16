package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    static Scanner input = new Scanner(System.in);
    static SecureRandom secureRandom = new SecureRandom();
    public static void main(String[] args) {
        System.out.println("Welcome to elementary school test!");
        System.out.println("You have five questions in total. Good luck..");
        for (int i = 0; i < 5; i++) {
            int a = secureRandom.nextInt(1,13);
            int b = secureRandom.nextInt(1,13);
            questionGenerator(a,b);
    }

    }
    public static void questionGenerator(int a, int b){
        System.out.printf("How much is %d times %d? %n",a,b);
        int userInput = input.nextInt();
        int correctAnswer = a * b;
        if (userInput == correctAnswer){
            System.out.println("Very good!");
        }
        else {
            System.out.println("No. Please try again.");
            questionGenerator(a,b);
        }
    }
}
