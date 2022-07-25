package chapter2;//To compare integers

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s = 100;

        System.out.println("Enter an integer: ");
        int int1 = input.nextInt();

        int square1 = int1 * int1;

        if (int1 > s) {
            System.out.printf("%d > %d%n", int1, s);
        }
        if (square1 > s) {
            System.out.printf("%d > %d%n", square1, s);
        }

        if (int1 < s) {
            System.out.printf("%d < 100 %n", int1, s);
        }
        if (square1 < s) {
            System.out.printf("%d < %d%n", square1, s);
        }


        if (int1 == s) {
            System.out.printf("%d == %d%n", int1, s);
        }
        if (square1 == s) {
            System.out.printf("%d == %d%n", square1, s);
        }


        if (int1 != s) {
            System.out.printf("%d != %d%n", int1, s);
        }
        if (square1 != s) {
            System.out.printf("%d != %d%n", square1, s);
        }

    }
}

	
	