package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountTest {

    @Test
    public void depositTest(){
        Account ernestAccount = new Account();
        ernestAccount.deposit(100);
        assertEquals(100, ernestAccount.getBalance());
    }

    @Test
    public void multipleDepositTest(){
        Account ernestAccount = new Account();
        ernestAccount.deposit(500);
        ernestAccount.deposit(700);
        ernestAccount.deposit(900);
        assertEquals(2100, ernestAccount.getBalance());
    }

    @Test
    public void negativeDepositTest(){
        Account ernestAccount = new Account();
        ernestAccount.deposit(-200);
        assertEquals(0,ernestAccount.getBalance());
    }

    @Test
    public void withdrawalTest(){
        Account ernestAccount = new Account();
        ernestAccount.deposit(1000);
        ernestAccount.withdrawal(400);
        assertEquals(600,ernestAccount.getBalance());
    }

    @Test
    public void maximumWithdrawalTest(){
        Account kenAccount = new Account();
        kenAccount.deposit(1000);
        kenAccount.withdrawal(2000);
        assertEquals(1000,kenAccount.getBalance());
    }

    @Test
    public void emptyAccountTest(){
        Account kenAccount = new Account();
        kenAccount.withdrawal(2000);
        assertEquals(0,kenAccount.getBalance());
    }

    @Test
    public void monthlyChargesTest(){
        Account kenAccount = new Account();
        kenAccount.deposit(1000);
        kenAccount.charges();
        assertEquals(990,kenAccount.getBalance());
    }
}

