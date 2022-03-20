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

    @Test
    public void biggestNumberTest(){
        Kata comparingInteger = new Kata();
        int result = comparingInteger.calculateTheLargestNumber(10, 1239, 76, 989, 333);
        assertEquals(1239, result);
    }

    @Test
    public void largestNumberTest(){
        Kata comparingNumber = new Kata();
        int result = comparingNumber.calculateTheLargestInteger(1, 2, 3, 4, 55);
        assertEquals(55, result);
    }

    @Test
    public void theNumberOfFactorTest(){
        Kata numberOfFactors = new Kata();
        int result = numberOfFactors.factorsOf(7);
        assertEquals(2, result);
    }

    @Test
    public void primeNumberTest(){
        Kata primeNumberCheck = new Kata();
        boolean result = primeNumberCheck.isAPrimeNumber(29);
        assertTrue(result);
    }
}
