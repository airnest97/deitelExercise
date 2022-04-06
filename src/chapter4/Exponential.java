package chapter4;

import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fact = 1;
        double numerator = 1;
        double result = 0;
        double exponential = 1;
        int n = 0;
        int x = 1;

        System.out.println("Enter the number of terms");
        int num = input.nextInt();
        for(int counter = 1; counter<=num; counter++){
            for(int numFact = 1; numFact<=num; numFact++) {
                x = numFact - n;
                fact = fact * x;
            }}

    }
}
