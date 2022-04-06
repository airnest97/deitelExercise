package eBanking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    private Bank gtBank;
    @BeforeEach
    public void setUp(){
        gtBank = new Bank("GtBank", 10);
    }


    @Test
    public void bankCanBeCreated(){
        Bank gtBank = new Bank("GtBank", 10);
        assertNotNull(gtBank);
        assertEquals("GtBank", gtBank.getName());
        assertEquals(10, gtBank.getMaximumNoOfCustomers());
    }

    @Test
    public void bankCanCreateAccount(){
        gtBank.createAccountFor("Saheed", "Osupa", "1234");
        gtBank.createAccountFor("SAmaka", "Amazing", "1234");
        gtBank.createAccountFor("SLanre", "Lan", "1234");
        gtBank.createAccountFor("MyGuy", "Okoro", "1234");
        assertEquals(4, gtBank.getNumberOfCustomers());
    }

    @Test
    public void createAccountCheckForFirstCustomerTest(){
        gtBank.createAccountFor("Saheed", "Osupa", "1234");
        gtBank.createAccountFor("Amaka", "Amazing", "1234");
        gtBank.createAccountFor("Lanre", "Lan", "1234");
        gtBank.createAccountFor("MyGuy", "Okoro", "1234");
        assertEquals(4, gtBank.getNumberOfCustomers());

        Accounting account = gtBank.findAccount(4);
        assertEquals("MyGuy Okoro", account.getFullName());
        assertEquals("4", account.getAccountNumber());
    }
}



