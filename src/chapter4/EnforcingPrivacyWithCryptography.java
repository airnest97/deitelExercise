package chapter4;

import java.util.Scanner;

public class EnforcingPrivacyWithCryptography {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four digit integer");
        int number = input.nextInt();

        //separating number with modulus and division and adding 7 to each seperated digit
        int num4 = (((number % 10)+7));
        int num3 = (((number % 100) / 10)+7);
        int num2 = (((number % 1000) / 100)+7);
        int num1 = (((number % 10000) / 1000)+7);

        //changing each digit to remainder after division by 10
        int newNum1=num1%10;
        int newNum2=num2%10;
        int newNum3=num3%10;
        int newNum4=num4%10;

        //switching first digit with third and second digit with fourth
        System.out.printf("The encrypted integer is %d%d%d%d%n", newNum3, newNum4, newNum1, newNum2);
    }
}
