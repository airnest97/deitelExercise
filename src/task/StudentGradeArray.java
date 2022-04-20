package task;

import javax.security.auth.Subject;
import java.util.Scanner;

public class StudentGradeArray {
    private static Scanner collector = new Scanner(System.in);
    static int[][] matrix;
    static int[][] total;
    static int[][] student;
    static int[][] position;
    static int[][] passes;
    static int[][] failures;
    static int[][] rearrangePosition;
    static double[][] average;

    public static void main(String[] args) {
        System.out.println("Enter the number of students: ");
        int studentNumber = collector.nextInt();

        System.out.println("Enter the number of subjects: ");
        int subjectNumber = collector.nextInt();
        enterGrade(studentNumber, subjectNumber);
        toComputeSumAndAverage(studentNumber, subjectNumber);
        arrangePosition(studentNumber);
        printTable(studentNumber, subjectNumber);
        System.out.println("SUBJECT SUMMARY ");
        printSubjectSummary(studentNumber,0);
        printSubjectSummary(studentNumber,1);
        printSubjectSummary(studentNumber,2);


    }


    public static void printShape() {
        String shape = "=";
        System.out.print(shape.repeat(75));
        System.out.println();
    }

    public static void printShape1() {
        String shape = "!";
        System.out.print(shape.repeat(75));
        System.out.println();
    }

    public static void arrangePosition(int studentNumber) {
        for (int i = 0; i < studentNumber; i++) {
            rearrangePosition[i][0] = total[i][0];
        }
        boolean status = true;
        while (status) {
            status = false;
            for (int i = 0; i < studentNumber - 1; i++) {
                if (rearrangePosition[i][0] < rearrangePosition[i + 1][0]) {
                    int temp = rearrangePosition[i + 1][0];
                    rearrangePosition[i + 1][0] = rearrangePosition[i][0];
                    rearrangePosition[i][0] = temp;
                    status = true;
                }

            }
        }
        for (int i = 0; i < studentNumber; i++) {
            rearrangePosition[i][1] = i + 1;
        }


        for (int i = 0; i < studentNumber; i++) {
            for (int j = 0; j < studentNumber; j++) {
                if (rearrangePosition[i][0] == total[j][0]) {
                    position[j][0] = rearrangePosition[i][1];
                }
            }

        }
    }

    public static void enterGrade(int studentNumber, int subjectNumber) {
        matrix = new int[studentNumber][subjectNumber];
        total = new int[studentNumber][1];
        student = new int[studentNumber][1];
        position = new int[studentNumber][1];
        passes = new int[subjectNumber][1];
        failures = new int[subjectNumber][1];
        rearrangePosition = new int[studentNumber][2];
        average = new double[studentNumber][1];


        for (int i = 0; i < studentNumber; i++) {
            for (int j = 0; j < subjectNumber; j++) {
                System.out.println("Enter student grade: ");
                matrix[i][j] = collector.nextInt();
            }
            student[i][0] = i + 1;
            System.out.println();
        }
    }

    public static void toComputeSumAndAverage(int studentNumber, int subjectNumber) {
        for (int i = 0; i < studentNumber; i++) {
            int sum = 0;
            for (int j = 0; j < subjectNumber; j++) {
                sum = sum + matrix[i][j];
            }
            total[i][0] = sum;
            average[i][0] = sum * 1.0 / subjectNumber;
        }
    }

    public static void printTable(int studentNumber, int subjectNumber) {
        printShape();
        System.out.print("STUDENT\t\t   ");
        for (int i = 0; i < subjectNumber; i++) {
            System.out.print("SUB" + (i + 1) + "    ");
        }
        System.out.println(" TOT     AVG     POS");
        printShape();


        for (int i = 0; i < studentNumber; i++) {
            System.out.print("Student " + student[i][0] + ".      ");
            for (int j = 0; j < subjectNumber; j++) {
                System.out.print(matrix[i][j] + "\t\t");
            }
            for (int j = 0; j < 1; j++) {
                System.out.printf("%3d    ", total[i][j]);
            }
            for (int j = 0; j < 1; j++) {
                System.out.printf("%5.2f     ", average[i][j]);
            }
            for (int j = 0; j < 1; j++) {
                System.out.print(position[i][j]);
            }
            System.out.println();
        }
        printShape();
        printShape();
    }

    public static void printSubjectSummary(int studentNumber, int subjectPosition) {
        int highestScore = matrix[0][subjectPosition];
        int lowestScore = matrix[0][subjectPosition];
        int highestScorer = student[0][0];
        int lowestScorer = student[0][0];
        int passes = 0;
        int failure = 0;
        if (matrix[0][subjectPosition] >= 50) {
            passes = 1;
        }
        if (matrix[0][subjectPosition] < 50) {
            failure = 1;
        }
        int total = matrix[0][subjectPosition];
        double average = 0;

        for (int i = 1; i < studentNumber; i++) {
            if (matrix[i][subjectPosition] > highestScore) {
                highestScore = matrix[i][subjectPosition];
                highestScorer = student[i][0];
            }
            if (matrix[i][subjectPosition] < lowestScore) {
                lowestScore = matrix[i][subjectPosition];
                lowestScorer = student[i][0];
            }
            if (matrix[i][subjectPosition] >= 50) {
                passes += 1;
            }
            if (matrix[i][subjectPosition] < 50) {
                failure += 1;
            }
            total = total + matrix[i][subjectPosition];
            average = (double) total / studentNumber;}

            System.out.println("Subject " + (subjectPosition + 1));
            System.out.printf("Highest scoring student is: Student %d scoring %d%n", highestScorer, highestScore);
            System.out.printf("Lowest scoring student is: Student %d scoring %d%n", lowestScorer, lowestScore);
            System.out.println("Total score is " + total);
            System.out.println("Average score is " + average);
            System.out.println();

        }
    }

