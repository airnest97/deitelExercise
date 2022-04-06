package chapter4;

import java.util.Scanner;

public class ReadingNumbersUntilSpecifiedSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number; ");
        int firstNumber = input.nextInt();
        int sum = 0;
        System.out.println("Enter another number");
        int anotherNumber = input.nextInt();
        for(int i=1;i<=firstNumber;i++){
            sum+= anotherNumber;
            if (sum >= firstNumber){break;}
            System.out.println("Enter another number");
            anotherNumber = input.nextInt();
        }
    }
}
