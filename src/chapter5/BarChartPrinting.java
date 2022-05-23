package chapter5;

import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("enter a number between 1 to 30");
            int num = input.nextInt();

            System.out.println("enter a number between 1 to 30");
            int num1 = input.nextInt();

            System.out.println("enter a number between 1 to 30");
            int num2 = input.nextInt();

            System.out.println("enter a number between 1 to 30");
            int num3 = input.nextInt();

            System.out.println("enter a number between 1 to 30");
            int num4 = input.nextInt();

        iterateThrough(num);
        iterateThrough(num1);
        iterateThrough(num2);
        iterateThrough(num3);
        iterateThrough(num4);

    }

    private static void iterateThrough(int number) {
        for (int i = 0; i < number; i++) {
            if(number <= 30)
                System.out.print("* ");
        }
        System.out.println();
    }
}
