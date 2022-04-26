package task;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPracticeSum {

    static Scanner input = new Scanner(System.in);

    static Random rand = new Random();

    public static void main(String[] args) {

        System.out.println("Enter number of row: ");
        int row = input.nextInt();

        System.out.println("Enter number of column: ");
        int column = input.nextInt();


        int [][] array = new int[row][column];

        loadArray(row, column, array, rand);
        printArray(row, column, array);
    }

    private static void printArray(int row, int column, int[][] array) {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + "\t\t");
                sum += array[i][j];
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(Arrays.deepToString(array));
        System.out.println();
        System.out.println("The sum of the array is: " + sum);
    }

    private static void loadArray(int row, int column, int[][] array, Random rand) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = rand.nextInt(1, 10);
            }
        }
    }
}
