package tddClass;

public class Account {
    private int balance;

    public void deposit(int amount){
        if (amount > 0)
        balance = balance + amount;
    }
    public int getBalance() {
        return balance;
    }

    public void withdrawal(int amount) {
        if (amount > 0)
            if (amount < balance)
            balance = balance - amount;
    }

    public void charges() {
        balance = (int) (balance - (0.01 * balance));
    }

}
