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

    public Accounting createAccountFor(String firstName, String lastName, String pin) {
        String accountNumber = (numberOfCustomer + 1)+"";
        Accounting account = new Accounting(accountNumber, firstName, lastName, pin);
        accounts[numberOfCustomer] = account;
        numberOfCustomer++;
        return account;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomer;
    }

    public Accounting findAccount(int accountNumber) {
//        int indexOfAccount = accountNumber - 1;
//        Accounting theAccount = accounts[indexOfAccount];
//        return theAccount;
        return accounts[accountNumber - 1];
    }

    public void deposit(int amount, String accountNumber) {
        Accounting account = findAccount(Integer.parseInt(accountNumber));
        account.deposit(amount);
    }

    public void withdraw(int amount, String accountNumber, String pin) {
        Accounting account = findAccount(Integer.parseInt(accountNumber));
        account.withdrawal(amount, pin);
    }

    public void transfer(int amount, String from, String to, String sendersPin) {
        Accounting senderAccount = findAccount(Integer.parseInt(from));
        Accounting receiverAccount = findAccount(Integer.parseInt(to));
        senderAccount.withdrawal(amount, sendersPin);
        receiverAccount.deposit(amount);
    }
}

