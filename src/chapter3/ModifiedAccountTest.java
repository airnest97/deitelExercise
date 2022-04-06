package chapter3;

import java.util.Scanner;

public class ModifiedAccountTest {
    public static void main(String[] args){
        ModifiedAccount account1 = new ModifiedAccount("First Account",0.0);
        ModifiedAccount account2 = new ModifiedAccount("Second Account",0.0);

        printBalance(account1,account2);

        deposit(account1);
        printBalance(account1,account2);
        withdrawal(account1);
        printBalance(account1,account2);

        deposit(account2);
        printBalance(account1,account2);
        withdrawal(account2);
        printBalance(account1,account2);

    }
    public static void printBalance(ModifiedAccount firstAccount,ModifiedAccount secondAccount){
        System.out.printf("%s Balance: $%.2f%n",firstAccount.getName(),firstAccount.getBalance());
        System.out.printf("%s Balance: $%.2f%n",secondAccount.getName(),secondAccount.getBalance());
    }
    public static void deposit(ModifiedAccount account){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account name: ");
        String name = input.nextLine();
        account.setName(name);

        System.out.printf("Enter deposit amount for %s account:%n",name);
        double amountDeposited = input.nextDouble();

        account.deposit(amountDeposited);
        System.out.printf("adding %.2f to %s account%n",amountDeposited, name);
    }
    public static void withdrawal(ModifiedAccount account){
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly remind me of your name to withdraw");
        String name = input.nextLine();
        System.out.printf("Enter withdrawal amount for your account, %s%n",name);
        double amountWithdrew = input.nextDouble();
        account.withdraw(amountWithdrew);
    }
}
