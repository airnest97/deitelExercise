package chapter4;

import java.util.Scanner;

public class DecimalEquivalentOfBinaryNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lastNumber = 1;
        int baseMultiplier = 1;
        int decimalNumber = 0;
        int n = 0;
        System.out.println("Enter the binary Number");
        int binaryNumber = input.nextInt();
        int duplicatedBinaryNumber = binaryNumber;

        while(binaryNumber > 0){
            lastNumber = binaryNumber%10;
            binaryNumber = binaryNumber / 10;

            n = lastNumber*baseMultiplier;
            baseMultiplier = baseMultiplier + baseMultiplier;
            decimalNumber = decimalNumber + n;
        }
        System.out.printf("The decimal equivalent of %d is %d",duplicatedBinaryNumber,decimalNumber);
        }

    }

