package chapter4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a non-negative integer");
        int number = input.nextInt();
        int fact = 1;
        for(int i =1; i<=number;i++){
            fact = fact * i;
        }
        System.out.printf("The factorial of %d is %d%n",number,fact);
        System.out.println();
        System.out.println("Here is part b of the question");
        System.out.println();

        System.out.println("Enter the number of terms to calculate for a value e in the form: ");
        System.out.println("e = 1 +(1/1!) +(1/2!)+(1/3!)+.....");
        double newFact = 1;
        double n = input.nextDouble();
        double e =1;
        for(int i=1;i<=n;i++){
            newFact = newFact*n;
            e = e + 1/newFact;
        }
        System.out.printf("The approximate value of e = %.2f%n",e);

    }

}
