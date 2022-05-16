package chapter6;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        while(count <= 10){
            System.out.println("Enter number: ");
            int Number = input.nextInt();
            System.out.println(isDivisible(Number));
            count+=1;
        }

    }
    public static boolean isDivisible(int Number){
        return Number % 5 == 0;
    }

    }

