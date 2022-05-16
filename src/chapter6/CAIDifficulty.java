package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAIDifficulty {
    static int correctCount = 0;
    static int wrongCount = 0;
    static Scanner input = new Scanner(System.in);
    static SecureRandom secureRandom = new SecureRandom();
    public static void main(String[] args) {
        System.out.println("Welcome to elementary school test!");
        System.out.println("You have ten questions in total. Good luck..");
        System.out.println();
        System.out.println("""
                Enter difficulty level:
                1.-> Level 1
                2.-> Level 2""");
        int level = input.nextInt();
        difficultyLevel(level);

        showResult();
    }
    public static void questionGenerator(int a, int b){
        System.out.printf("How much is %d times %d? %n",a,b);
        int userInput = input.nextInt();
        int correctAnswer = a * b;

        if (userInput == correctAnswer){
            correctCount +=1;
        }

        else {wrongCount +=1;
        }
    }

    public static void showResult(){
        int percentage = correctCount * 10;

        if (percentage >= 75){
            System.out.println("You scored "+percentage+"%");
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else {System.out.println("You scored "+percentage+"%");
            System.out.println("Please ask your teacher for extra help");}
    }
    public static void difficultyLevel(int level){
        switch (level){
            case 1: for (int i = 0; i < 10; i++) {
                int a = secureRandom.nextInt(1,13);
                int b = secureRandom.nextInt(1,13);
                questionGenerator(a,b);}
                break;
            case 2: for (int i = 0; i < 10; i++) {
                int a = secureRandom.nextInt(10,26);
                int b = secureRandom.nextInt(10,26);
                questionGenerator(a,b);}
                break;
            default: difficultyLevel(level);
            break;

        }
    }
}
