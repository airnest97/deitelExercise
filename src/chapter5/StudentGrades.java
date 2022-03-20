package chapter5;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        int numberOfGradeA = 0;
        int numberOfGradeB = 0;
        int numberOfGradeC = 0;
        int numberOfGradeD = 0;

        Scanner input = new Scanner(System.in);
//        String name = " ";

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter student name:");
            String name = input.nextLine();

            System.out.println("Enter student grade in letter:");
            String grade = input.nextLine();


            switch (grade.toUpperCase()) {
                case "A" -> numberOfGradeA++;
                case "B" -> numberOfGradeB++;
                case "C" -> numberOfGradeC++;
                case "D" -> numberOfGradeD++;
                default -> System.out.println("Unexpected value: " + grade.toUpperCase());
            }
            System.out.println(name + " got " +grade.toUpperCase() +" grade");
        }

        System.out.println("The number of student with A grade is: " + numberOfGradeA);
        System.out.println("The number of student with B grade is: " + numberOfGradeB);
        System.out.println("The number of student with C grade is: " + numberOfGradeC);
        System.out.println("The number of student with D grade is: " + numberOfGradeD);
    }
}
