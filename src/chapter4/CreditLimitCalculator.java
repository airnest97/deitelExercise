package chapter4;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account number");
        int acctNumber = input.nextInt();

        System.out.println("Enter the beginning balance");
        int beginningBalance = input.nextInt();

        System.out.println("Enter the total of item charged");
        int itemCharged = input.nextInt();

        System.out.println("Enter the total of credit applied");
        int creditApplied = input.nextInt();

        System.out.println("Enter credit limit");
        int creditLimit = input.nextInt();

        int newBalance = (beginningBalance + itemCharged - creditApplied);

        if(newBalance > creditLimit){
            System.out.println("The new balance is "+newBalance);
            System.out.println("Credit limit exceeded");
        }
        else System.out.println("The new balance is "+newBalance);

    }
}
