package chapter5;

import java.util.Scanner;

public class barChartPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int num;
    int num1;
    int num2;
    int num3;
    int num4;

            System.out.println("enter a number between 1 to 30");
            num = input.nextInt();
            System.out.println("enter a number between 1 to 30");
            num1 = input.nextInt();
            System.out.println("enter a number between 1 to 30");
            num2 = input.nextInt();
            System.out.println("enter a number between 1 to 30");
            num3 = input.nextInt();
            System.out.println("enter a number between 1 to 30");
            num4 = input.nextInt();


        for (int i = 0; i < num; i++) {
            if(num<=30)
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < num1; i++) {
            if(num<=30)
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < num2; i++) {
            if(num<=30)
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < num3; i++) {
            if(num<=30)
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < num4; i++) {
            if(num<=30)
            System.out.print("* ");
        }

    }
}
