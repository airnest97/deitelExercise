package chapter4;

import java.util.Scanner;

public class DecryptingEncryptedFourDigitInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the encrypted number");
        int encryptedNumber = input.nextInt();

        //separating number with modulus and division
        int num4 = (encryptedNumber % 10);
        int num3 = (encryptedNumber % 100) / 10;
        int num2 = (encryptedNumber % 1000) / 100;
        int num1 = (encryptedNumber % 10000) / 1000;
        int newNum1 = 1;
        int newNum2 = 1;
        int newNum3 = 1;
        int newNum4 = 1;

        //Removing modulus effect from the encryption process and subtracting 7
        if((num1 == 7) || (num1 == 8) || (num1 == 9))
        newNum1 = num1 - 7;
        else newNum1 = num1 + 10 - 7;

        if((num2 == 7) || (num2 == 8) || (num2 == 9))
            newNum2 = num2 - 7;
        else newNum2 = num2 + 10 - 7;

        if((num3 == 7) || (num3 == 8) || (num3 == 9))
            newNum3 = num3 - 7;
        else newNum3 = num3 + 10 - 7;

        if((num4 == 7) || (num4 == 8) || (num4 == 9))
            newNum4 = num4 - 7;
        else newNum4 = num4 + 10 - 7;

        System.out.printf("The original number before encryption was %d%d%d%d%n",newNum3,newNum4,newNum1,newNum2);

    }
}
