package task;

import java.util.Scanner;

public class palindrome1 {
    public static void main(String[] args) {
        Scanner collector = new Scanner(System.in);

        System.out.println("Enter five digit number");
        int digit = collector.nextInt();

        int firstDigit = digit / 100000;
        int secondDigit = (digit % 100000) / 10000;
        int thirdDigit = (digit % 10000) / 1000;
        int fourthDigit = (digit % 1000) /100;
        int fifthDigit = (digit % 100) / 10;
        int sixthDigit = digit % 10;

        if(firstDigit == sixthDigit && secondDigit == fifthDigit && thirdDigit ==fourthDigit)
            System.out.println("This is a palindrome");
        else
            System.out.println("This is not a palindrome");

    }
}
