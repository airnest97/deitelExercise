package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAIMonitoringStudentPerformance {
    static int correctCount = 0;
    static int wrongCount = 0;
    static Scanner input = new Scanner(System.in);
    static SecureRandom secureRandom = new SecureRandom();
    public static void main(String[] args) {
        System.out.println("Welcome to elementary school test!");
        System.out.println("You have ten questions in total. Good luck..");
        for (int i = 0; i < 10; i++) {
            int a = secureRandom.nextInt(1,13);
            int b = secureRandom.nextInt(1,13);
            questionGenerator(a,b);
        }
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
}
