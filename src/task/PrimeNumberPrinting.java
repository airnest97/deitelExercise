package task;

import java.util.Scanner;

public class PrimeNumberPrinting {
    public static void main(String[] args) {
        int i;
        int num;
        StringBuilder primeNumbers = new StringBuilder(" ");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = input.nextInt();

        for (i = 1; i <= n ; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0){
                    counter += 1;
                }
            }
            if (counter == 2){
                primeNumbers.append(i).append(" ");
            }
        }
        System.out.println("Prime Number from 1 to 100 is: ");
        System.out.println(primeNumbers);

//        for (int i = 1; i <= n; i++) {
//            int count = 0;
//            for (int j = 2; j <= i / 2; j++) {
//                if (i % j == 0) {
//                    count++;
//                    break;
//                }
//            }
//            if (count == 0){
//                System.out.println(i);
//            }
//        }

    }
}
