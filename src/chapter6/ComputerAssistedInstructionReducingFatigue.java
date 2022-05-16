package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstructionReducingFatigue {
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
        int correctAnswerResponse = secureRandom.nextInt(1,5);
        int wrongAnswerResponse = secureRandom.nextInt(1,5);
        System.out.printf("How much is %d times %d? %n",a,b);
        int userInput = input.nextInt();
        int correctAnswer = a * b;

        if (userInput == correctAnswer){
            isCorrectAnswerResponse(correctAnswerResponse);
        }
        else {
            isWrongAnswerResponse(wrongAnswerResponse);
            questionGenerator(a,b);
        }
    }
    public static void isCorrectAnswerResponse(int correctAnswerResponse){
        switch (correctAnswerResponse) {
            case 1 -> System.out.println("Very good!");
            case 2 -> System.out.println("Excellent!");
            case 3 -> System.out.println("Nice work!");
            case 4 -> System.out.println("Keep up the good work!");
        }
    }
    public static void isWrongAnswerResponse(int wrongAnswerResponse){
        switch (wrongAnswerResponse) {
            case 1 -> System.out.println("No. Please try again.");
            case 2 -> System.out.println("Wrong. Try once more.");
            case 3 -> System.out.println("Don't give up!");
            case 4 -> System.out.println("No. Keep trying.");
        }
    }
}
