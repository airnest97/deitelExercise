package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {

    @Test
    public void additionTest(){
        Kata calculator = new Kata();
        int result = calculator.getSum(3,4);
        assertEquals(7,result);
    }

    @Test
    public void subtractionTest(){
        Kata calculator = new Kata();
        int result = calculator.getSubtraction(7,4);
        assertEquals(3, result);
    }

    @Test
    public void circleAreaTest(){
        Kata calculator = new Kata();
        double result = calculator.getArea(5);
        assertEquals(78.53981633974483, result);
    }

    @Test
    public void bitFlipperTest(){
        Kata flip = new Kata();
        int result = flip.getFlipValue(0);
        assertEquals(1, result);
    }

    @Test
    public void palindromeTest(){
        Kata kata = new Kata();
        //assertTrue(kata.isPalindrome(12345));
        boolean result = kata.isPalindrome(112211);
        assertTrue(result);
    }

    @Test
    public void utmeAppTest(){
        Kata utmeApp = new Kata();
        int result = utmeApp.getQuantity(10);
        assertEquals(16000, result);
    }

    @Test
    public void evenOddNumberTest(){
        Kata evenAndOdd = new Kata();
        boolean result = evenAndOdd.isEven(1000000);
        assertTrue(result);
    }
}
