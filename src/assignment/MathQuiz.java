package assignment;

import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
     public static Random randomNumber = new Random();
     public static Scanner scanner = new Scanner(System.in);
     public static int count1 = 0;
     public static int count2 = 0;

    public static void main(String[] args) {
        runQuiz();
    }

    private static void runQuiz() {
        for(int i = 1; i < 11; i++) {
            serveQuestion();
        }
        System.out.println("You scored "+count1);
        System.out.println("You failed "+count2);

        int score = count1 - count2;
        System.out.println("Your total score is: " + score);
    }

    private static void serveQuestion() {
        int mathQuiz = randomNumber.nextInt(1,5);
        switch (mathQuiz) {
            case 1 -> addition();
            case 2 -> subtraction();
            case 3 -> multiplication();
            case 4 -> division();
            default -> throw new IllegalStateException("Unexpected value: " + mathQuiz);
        }
    }

    public static void addition(){
        int input1 = randomNumber.nextInt(1,11);
        int input2 = randomNumber.nextInt(1,11);
        System.out.print(input1 + " + " + input2 + " = ");

        int userResult = scanner.nextInt();
        int result = input1 + input2;

        if (userResult == result) count1++;
        else count2++;
    }

    public static void subtraction(){
        int input1 = randomNumber.nextInt(1,11);
        int input2 = randomNumber.nextInt(1,11);
        System.out.print(input1 + " - " + input2 + " = ");

        int userResult = scanner.nextInt();
        int result = input1 - input2;

        if (userResult == result) count1++;
        else count2++;
    }

    public static void multiplication(){
        int input1 = randomNumber.nextInt(1,11);
        int input2 = randomNumber.nextInt(1,11);
        System.out.print(input1 + " X " + input2 + " = ");

        int userResult = scanner.nextInt();
        int result = input1 * input2;

        if (userResult == result)count1++;
        else count2++;
    }

    public static void division() {
        int input1 = randomNumber.nextInt(1,11);
        int input2 = randomNumber.nextInt(1,11);
        System.out.print(input1 + " / " + input2 + " = ");

        double userResult = scanner.nextDouble();
        double result = (input1 * 1.0) / input2;

        if(userResult == result)count1++;
        else count2++;
    }
}