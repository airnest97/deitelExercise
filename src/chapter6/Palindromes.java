package chapter6;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any five digit number: ");
        int number = input.nextInt();
        isPalindrome(number);
    }

    public static void isPalindrome(int number) {
        if (number > 10000 && number <= 99999) {
            int num5 = (number % 10);
            int num4 = (number % 100) / 10;
            int num3 = (number % 1000) / 100;
            int num2 = (number % 10000) / 1000;
            int num1 = (number % 100000) / 10000;
            if ((num1 == num5) && (num2 == num4)) {
                System.out.printf("%d is a palindrome%n", number);
            } else {
                System.out.printf("%d is not a palindrome %n", number);
            }
        }
    }
}
