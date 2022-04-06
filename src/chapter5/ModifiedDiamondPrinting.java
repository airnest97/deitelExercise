package chapter5;

import java.util.Scanner;

public class ModifiedDiamondPrinting {
    public static void main(String[] args) {
        shapeDigitInput();

    }
    public static void createShape(int number){
        for(int i= 1; i <= (number/2)+1; i++){
            for(int j = i; j <= (number/2)+1; j++){
            System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
            System.out.print("x ");
            }
            for(int j = 1; j < i; j++){
            System.out.print("x ");
            }
            System.out.println();
        }
        for(int m= number-1; m >= 1; m--){
            for(int j = m; j <= number; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= m; j++){
                System.out.print("x ");
            }
            for(int j = 1; j < m; j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
    public static void shapeDigitInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any odd number between 1 and 19 to create diamond shape: ");
        int number = input.nextInt();
        if(number >= 1 && number <= 19 )if (number%2 != 0){
            createShape(number);}
        else {System.out.println("invalid entry, try again");shapeDigitInput();}}

}
