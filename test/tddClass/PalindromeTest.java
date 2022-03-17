package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {

    @Test
    public void palindromeChecker() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome(112211);
        assertTrue(result);
    }

}
