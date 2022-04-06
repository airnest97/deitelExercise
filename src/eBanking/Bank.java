package eBanking;

public class Bank {
    private final String name;
    private Accounting[] accounts;
    private int numberOfCustomer;

    public Bank(String bankName, int numberOfCustomer){
        name = bankName;
        accounts = new Accounting[numberOfCustomer];
    }

    public String getName() {
        return name;
    }

    public int getMaximumNoOfCustomers() {
        return accounts.length;
    }

    public void createAccountFor(String firstName, String lastName, String pin) {
        String accountNumber = (numberOfCustomer+1)+"";
        Accounting account = new Accounting(accountNumber, firstName, lastName, pin);
        accounts[numberOfCustomer] = account;
        numberOfCustomer++;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomer;
    }

    public Accounting findAccount(int accountNumber) {
        int indexOfAccount = accountNumber -1;
        Accounting theAccount = accounts[indexOfAccount];
        return theAccount;
    }
}
