package task;

import java.util.Scanner;

public class StudentGradeArray {
    public static void main(String[] args) {
        Scanner collector = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int studentNumber = collector.nextInt();

        System.out.println("Enter the number of subjects: ");
        int subjectNumber = collector.nextInt();

        int array [][] = new int[studentNumber][subjectNumber];
        System.out.println();

        for (int i = 0; i < studentNumber; i++) {
            for (int j = 0; j < subjectNumber; j++) {
                System.out.println("Enter student grade: ");
                array[i][j] = collector.nextInt();
            }
            System.out.println();
        }
        System.out.println("\t\tSubject1\t\tSubject2\t\t\tSubject3");
        for (int i = 0; i < studentNumber; i++) {
            System.out.print("Student"+ (i+1) + ". ");
            for (int j = 0; j < subjectNumber; j++) {
                System.out.print(array[i][j]+ "\t\t\t\t");
            }
            System.out.println();
        }
    }
}
