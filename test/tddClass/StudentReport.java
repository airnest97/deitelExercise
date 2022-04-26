package tddClass;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentReport {

    @Test
    public void testForSumPerStudent(){
        int[][] grades = {{50, 50}, {60, 60, 60}, {40, 40, 40}};
        StudentReports report = new StudentReports(grades);
        assertEquals(100, report.getSumPerStudent(0));
        assertEquals(180,  report.getSumPerStudent(1));
        assertEquals(120, report.getSumPerStudent(2));
    }

    @Test
    public void testForStudentAverage(){
        int[][] grades = {{4, 5, 6, 3}, {60, 60, 60}, {40, 40, 40}};
        StudentReports report = new StudentReports(grades);
        assertEquals(4.5, report.getAverageForStudent(0));
        assertEquals(60.0, report.getAverageForStudent(1));
        assertEquals(40, report.getAverageForStudent(2));
    }

    @Test
    public void testForPosition(){
        int[][] grades = {{4, 5, 6, 3}, {60, 60, 60}, {40, 40, 40}};
        StudentReports report = new StudentReports(grades);
        assertEquals(3, report.getStudentPosition(0));
        assertEquals(1, report.getStudentPosition(1));
        assertEquals(2, report.getStudentPosition(2));
    }
}
