package chapter3;

import java.util.Scanner;

public class RemovingDuplicatedAccountTest{
    public static void main(String[] args){
    RemovingDuplicatedAccount account1 = new RemovingDuplicatedAccount("Adewale",23.50);
    RemovingDuplicatedAccount account2 = new RemovingDuplicatedAccount("Bunmi",-15.23);

    displayAccount(account1);
    displayAccount(account2);

    Scanner input = new Scanner(System.in);

    System.out.println("Enter account name for account1:");
    String name1 = input.nextLine();
    account1.setName(name1);

    System.out.println("Enter deposit amount for account1:");
    double amountDeposited = input.nextDouble();

    account1.deposit(amountDeposited);
    System.out.printf("adding %.2f to account1%n",amountDeposited);

    System.out.println("Enter deposit amount for account2:");
    double amountDeposited2 = input.nextDouble();

    System.out.println("Enter account name for account2:");
    String newName = input.nextLine();
    account2.setName(newName);

    account2.deposit(amountDeposited2);
    System.out.printf("adding %.2f to account2%n",amountDeposited2);

    displayAccount(account1);
    displayAccount(account2);

    System.out.println("Enter withdrawal amount for account1");
    double amountWithdrew = input.nextDouble();
    account1.withdraw(amountWithdrew);

    displayAccount(account1);
    displayAccount(account2);

    System.out.println("Enter withdrawal amount for account2");
    double amountWithdrew2 = input.nextDouble();
    account2.withdraw(amountWithdrew2);

    displayAccount(account1);
    displayAccount(account2);
}
    public static void displayAccount(RemovingDuplicatedAccount account){
        System.out.printf("%s Balance: $%.2f%n",account.getName(),account.getBalance());
    }
}
