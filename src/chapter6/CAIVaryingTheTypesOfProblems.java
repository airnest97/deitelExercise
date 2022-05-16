package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAIVaryingTheTypesOfProblems {
    static int correctCount = 0;
    static int wrongCount = 0;
    static Scanner input = new Scanner(System.in);
    static SecureRandom secureRandom = new SecureRandom();
    public static void main(String[] args) {
        System.out.println("Welcome to elementary school test!");
        System.out.println("You have ten questions in total. Good luck..");
        System.out.println();
        System.out.println("""
                Pick the type of arithmetic problem to study:
                1.-> Addition
                2.-> Subtraction
                3.-> Division
                4.-> Multiplication
                5.-> Random Mixture""");
        int arithmeticType = input.nextInt();

        chooseArithmeticType(arithmeticType);

        showResult();
    }


    public static void chooseArithmeticType(int arithmeticType){
        switch (arithmeticType) {
            case 1 -> Addition();
            case 2 -> Subtraction();
            case 3 -> Division();
            case 4 -> Multiplication();
            case 5 -> randomFunctionSelector();
        }
    }
    public static void Addition() {
        for (int i = 0; i < 10; i++) {
            int a = secureRandom.nextInt(1,13);
            int b = secureRandom.nextInt(1,13);
            System.out.printf("How much is %d plus %d? %n", a, b);
            int userInput = input.nextInt();
            int correctAnswer = a + b;
            answerConditional(correctAnswer, userInput);
        }
    }
    public static void Subtraction(){
        for (int i = 0; i < 10; i++) {
            int a = secureRandom.nextInt(1,13);
            int b = secureRandom.nextInt(1,13);
            System.out.printf("How much is %d minus %d? %n",a,b);
            int userInput = input.nextInt();
            int correctAnswer = a - b;
            answerConditional(correctAnswer,userInput);
        }
    }
    public static void Division(){
        for (int i = 0; i < 10; i++) {
            int a = secureRandom.nextInt(1,13);
            int b = secureRandom.nextInt(1,13);
            System.out.printf("How much is %d divided by %d? %n",a,b);
            int userInput = input.nextInt();
            int correctAnswer = a / b;
            answerConditional(correctAnswer,userInput);}
    }
    public static void Multiplication() {
        for (int i = 0; i < 10; i++) {
            int a = secureRandom.nextInt(1, 13);
            int b = secureRandom.nextInt(1, 13);
            System.out.printf("How much is %d multiply by %d? %n", a, b);
            int userInput = input.nextInt();
            int correctAnswer = a * b;
            answerConditional(correctAnswer, userInput);
        }
    }

    public static void answerConditional(int correctAnswer, int userInput){
        if (userInput == correctAnswer){
            correctCount +=1;
        }
        else {wrongCount +=1;
        }
    }
    public static void randomFunctionSelector(){
        for (int i = 0; i < 10; i++) {
            int a = secureRandom.nextInt(1, 13);
            int b = secureRandom.nextInt(1, 13);
            int functionSelector = secureRandom.nextInt(1,5);
        switch (functionSelector) {
            case 1 -> {
                System.out.printf("How much is %d plus %d? %n", a, b);
                int userInput = input.nextInt();
                int correctAnswer = a + b;
                answerConditional(correctAnswer, userInput);
            }
            case 2 -> {
                System.out.printf("How much is %d minus %d? %n", a, b);
                int userInput1 = input.nextInt();
                int correctAnswer1 = a - b;
                answerConditional(correctAnswer1, userInput1);
            }
            case 3 -> {
                System.out.printf("How much is %d divided by %d? %n", a, b);
                int userInput2 = input.nextInt();
                int correctAnswer2 = a / b;
                answerConditional(correctAnswer2, userInput2);
            }
            case 4 -> {
                System.out.printf("How much is %d multiply by %d? %n", a, b);
                int userInput3 = input.nextInt();
                int correctAnswer3 = a * b;
                answerConditional(correctAnswer3, userInput3);}
            }
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


}
