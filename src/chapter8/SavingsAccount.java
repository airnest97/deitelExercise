package chapter8;

public class SavingsAccount {
    static double annualInterestRate = 0.5;

    private int savingsBalance;

    public SavingsAccount(int savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest(){
        int monthlyInterest = (int) (((savingsBalance * annualInterestRate) / 12) + savingsBalance);
        System.out.println("The monthly interest rate is: " + monthlyInterest);
    }

    public static void modifyInterestRate(double newAnnualInterestRate) {
        if (annualInterestRate > 0) {
            annualInterestRate = newAnnualInterestRate;
        }
        else {
            throw new IllegalArgumentException();
        }

    }
}
