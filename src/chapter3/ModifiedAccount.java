package chapter3;

public class ModifiedAccount {
    private String name;
    private double balance;

    public ModifiedAccount(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void deposit(double amountDeposit) {
        if (amountDeposit > 0.0) {
            balance = balance + amountDeposit;
        }
    }

    public void withdraw(double amountWithdrew) {
        if (amountWithdrew > balance) {System.out.println("Withdrawal amount exceeded your current account balance!");
    }
        if (amountWithdrew <= balance && amountWithdrew > 0) {
            balance = balance - amountWithdrew;
        }

    }

    public double getBalance(){
        return balance;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


}
