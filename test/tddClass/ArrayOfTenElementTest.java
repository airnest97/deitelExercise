package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOfTenElementTest {
    public ArrayOfTenElements number;
    @BeforeEach
    public void setUp(){
        number = new ArrayOfTenElements();
    }

    @Test
    public void maximumNumberInArray(){
        int[] scores = {34, 23, 14, 45, 23};
        assertEquals(45, number.findMaximumFrom(scores));
    }

    @Test
    public void minimumNumberInArray(){
        int[] scores = {34, 23, 14, 45, 23};
        assertEquals(14, number.findMinimumFrom(scores));
    }

    @Test
    public void averageOfNumberInArray(){
        int [] scores = {34, 23, 14, 45, 23};
        assertEquals(27.8, number.findAverageFrom(scores));
    }

    @Test
    public void sumOfNumberInArray(){
        int[] scores = {34, 23, 14, 45, 23};
        assertEquals(139, number.findSumFrom(scores));
    }
}
