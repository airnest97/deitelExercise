package task;

import assignment.MathQuiz;

import java.util.Scanner;

public class StudentGradeArray {
    public static void main(String[] args) {
        Scanner collector = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int studentNumber = collector.nextInt();

        System.out.println("Enter the number of subjects: ");
        int subjectNumber = collector.nextInt();

        int[][] array = new int[studentNumber][subjectNumber];
        int[][] total = new int[studentNumber][1];
        double[][] average = new double[studentNumber][1];

        System.out.println();

        for (int i = 0; i < studentNumber; i++) {
            for (int j = 0; j < subjectNumber; j++) {
                System.out.println("Enter student grade: ");
                array[i][j] = collector.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < studentNumber; i++) {
            int sum = 0;
            for (int j = 0; j < subjectNumber; j++) {
                sum = sum + array[i][j];
            }
            total[i][0] = sum;
            average[i][0] = sum * 1.0/subjectNumber;
        }

        System.out.println("\t\tSubject1\t\tSubject2\t\t\tSubject3\t\tTotal\t\tAverage");


        for (int i = 0; i < studentNumber; i++) {
            System.out.print("Student"+ (i+1) + ". ");
            for (int j = 0; j < subjectNumber; j++) {
                System.out.print(array[i][j]+ "\t\t\t\t");
            }
            for (int j = 0; j < 1; j++) {
                System.out.print(total[i][j]+ "\t\t\t\t");
            }
            for (int j = 0; j < 1; j++) {
                System.out.print(average[i][j]+ "\t\t\t\t");
            }
            System.out.println();
        }
    }
}
