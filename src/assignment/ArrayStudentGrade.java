package assignment;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number of subject");
        int subject = scanner.nextInt();
        System.out.println("enter the no of student");
        int student = scanner.nextInt();

        int [][] studentProfile = new int[subject][student];


//        To collect user input
        for (int i = 0; i < studentProfile.length; i++) {
            for (int j = 0; j < studentProfile[i].length; j++) {
                System.out.println("enter the student's score");
                studentProfile[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(studentProfile));
//    calculations
                     int [] sortedArray = new int[student];

        double average = 0.0;

        for (int i = 0; i < studentProfile.length; i++) {
            int total=0;
              System.out.print("student" + (i+1) + " ");

            for ( int j= 0; j < studentProfile[i].length ; j++) {
                total+= studentProfile[i][j];
                average = total * 1.0/studentProfile[i].length;
              System.out.print(studentProfile[i][j] + " ");
                sortedArray[j] = total;
            }
            System.out.print(total + " ");
            System.out.printf("%.2f", average);

              System.out.println();
        }

    }

}
