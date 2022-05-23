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

    @Test
    public void factorialTest(){
        Kata factorial = new Kata();
        int result = factorial.getFactorialOf(5);
        assertEquals(120, result);
    }

    @Test
    public void maximumNumberInArrayTest(){
        Kata kata = new Kata();
        int[] scores = {34, 23, 14, 45, 23};
        assertEquals(45, kata.findMaximumFrom(scores));
    }

    @Test
    public void minimumNumberInArray(){
        Kata kata = new Kata();
        int[] scores = {34, 23, 14, 45, 23};
        assertEquals(14, kata.findMinimumFrom(scores));
    }

    @Test
    public void averageOfNumberInArray(){
        Kata kata = new Kata();
        int[] scores = {34, 23, 14, 45, 23};
        assertEquals(27.8, kata.findAverageFrom(scores));
    }

    @Test
    public void sumOfNumberInArray(){
        Kata kata = new Kata();
        int[] scores = {34, 23, 14, 45, 23};
        assertEquals(139, kata.findSumFrom(scores));
    }

    @Test
    void sumOfDistinctFigure(){
        Kata kata = new Kata();
        int[] array = {3, 7, 1, 9};
        int[] array2 = {2, 4, 1, 9, 3};
        int result = kata.sumOfDistinctFigure(array, array2);
        assertEquals(13, result);
    }

    @Test
    void sumOfOverlappingElement(){
        Kata kata = new Kata();
        int[] array = {12, 13, 6, 10};
        int[] array1 = {13, 10, 16, 15};
        int result = kata.sumOfOverlappingElement(array, array1);
        assertEquals(46, result);
    }
}
