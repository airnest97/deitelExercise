package assignment;

import java.util.Random;

public class Array {
    public static void main(String[] args) {

        int largest = 0;
        int sum = 0;
        double average = 0;

        int [] ernest = new int[10];
        Random rand = new Random();

        randomArray(ernest, rand);

        largestNumberInArray(largest, ernest);

        sum = sumOfArray(sum, ernest);

        averageOfArray(sum, average, ernest);
    }

    private static void averageOfArray(double sum, double average, int[] ernest) {
        for (int i = 0; i < ernest.length; i++) {
            average = sum / ernest.length;
        }
        System.out.println("The average of the array is: " + average);
    }

    private static int sumOfArray(int sum, int[] ernest) {
        for (int i = 0; i < ernest.length; i++) {
            sum += ernest[i];
        }
        System.out.println("The sum of the array is: " + sum);
        return sum;
    }

    private static void largestNumberInArray(int largest, int[] ernest) {
        for (int i = 0; i < ernest.length; i++) {
            if(ernest[i] > largest)
                largest = ernest[i];
        }
        System.out.println("The largest number in the array is: " + largest);
    }

    private static void randomArray(int[] ernest, Random rand) {
        for (int i = 0; i < ernest.length; i++) {
            ernest[i] = 1 + rand.nextInt(11);
        }
        for (int i = 0; i < ernest.length; i++) {
            System.out.print(ernest[i] + " ");
        }
        System.out.println();
    }
}
