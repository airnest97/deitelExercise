package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {
    private static final Scanner input = new Scanner(System.in);
    private static int[] fibonacciNumber;
    private static double[] fibonacciNumber2;
    public static void main(String[] args) {
        System.out.println("Enter the value of n to calculate the fibonacci series: ");
        int n = input.nextInt();
        fibonacciInt(n);
        System.out.println(Arrays.toString(fibonacciNumber));

        fibonacciDouble(n);
        System.out.println(Arrays.toString(fibonacciNumber2));


    }
    public static void fibonacciInt(int n){
    fibonacciNumber = new int[n];
        int previousNumber = 0;
        int nextNumber = 1;
        int largest = 0;
        for (int i = 0; i < fibonacciNumber.length; i++) {
         int temp = previousNumber + nextNumber;
         fibonacciNumber[i] = previousNumber;
         if(fibonacciNumber[i] > largest){
             largest = fibonacciNumber[i];}
         previousNumber = nextNumber;
         nextNumber = temp;
        }
        System.out.println("The largest fibonacci number is: "+largest);
    }

    public static void fibonacciDouble(int n){
        fibonacciNumber2 = new double[n];
        double previousNumber = 0.0;
        double nextNumber = 1.0;
        double largest = 0.0;
        for (int i = 0; i < fibonacciNumber2.length; i++) {
            double temp = previousNumber + nextNumber;
            fibonacciNumber2[i] = previousNumber;
            if(fibonacciNumber2[i] > largest){
                largest = fibonacciNumber2[i];}
            previousNumber = nextNumber;
            nextNumber = temp;
        }
        System.out.println("The largest fibonacci number is: "+largest);
    }
}
