package assignment;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
     static Random randomNumber = new SecureRandom();
     static Scanner scanner= new Scanner(System.in);
     static int count1 = 0;
     static int count2 = 0;

    public static void main(String[] args) {

        for(int i = 1; i < 11; i++) {
            int mathQuiz = randomNumber.nextInt(1,5);
            switch (mathQuiz) {
                case 1 -> addition();
                case 2 -> subtraction();
                case 3 -> multiplication();
                case 4 -> division();
                default -> throw new IllegalStateException("Unexpected value: " + mathQuiz);
            }
        }
        System.out.println("You scored "+count1);
        System.out.println("You failed "+count2);

        int score = count1 - count2;
        System.out.println("Your total score is: " + score);
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
        if(input1 > input2) {
            System.out.print(input1 + " - " + input2 + " = ");

            int userResult = scanner.nextInt();
            int result = input1 - input2;

            if (userResult == result) count1++;
            else count2++;
        }
        else if(input1 < input2){
            System.out.print(input2 + " - " + input1 + " = ");

            int userResult = scanner.nextInt();
            int result = input2 - input1;

            if(userResult == result)count1++;
            else count2++;
        }
    }

    public static void multiplication(){
        int input1 = randomNumber.nextInt(1,11);
        int input2 = randomNumber.nextInt(1,11);
        System.out.print(input1 + " * " + input2 + " = ");

        int userResult = scanner.nextInt();
        int result = input1 * input2;

        if (userResult == result)count1++;
        else count2++;
    }

    public static void division() {
        int input1 = randomNumber.nextInt(1,11);
        int input2 = randomNumber.nextInt(1,11);

        if (input1 > input2) {
            System.out.print(input1 + " / " + input2 + " = ");

            double userResult = scanner.nextDouble();
            double result = (input1 * 1.0) / input2;

            if(userResult == result)count1++;
            else count2++;
        }
        else if(input1 < input2){
            System.out.print(input2 + " / " + input1 + " = ");

            double userResult = scanner.nextDouble();
            double result = (input2 * 1.0) / input1;

            if(userResult == result)count1++;
            else count2++;
        }
    }
}