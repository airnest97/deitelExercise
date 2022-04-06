package chapter4;

import java.util.Scanner;

public class CreatingAComparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first Number ");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second Number");
        int secondNumber = input.nextInt();
        if(firstNumber==secondNumber){
            System.out.println(0);
        }
        else if(firstNumber>secondNumber){
            System.out.println(1);
        }
        else {
            System.out.println(-1);}
    }
}
