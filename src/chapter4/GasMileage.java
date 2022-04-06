package chapter4;

import java.util.Scanner;

public class GasMileage{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the miles driven (end the program with -1) : ");
        int milesDriven = input.nextInt();
        System.out.println("Enter the number of gallons used: ");
        int gallonUsed = input.nextInt();
        double total = 0.0;
        double milesPerGallon;

        while( milesDriven != -1){
            milesPerGallon = (double)milesDriven / gallonUsed;
            total += milesPerGallon;

            System.out.println("Enter the miles driven (end the program with -1: ");
            milesDriven = input.nextInt();

            if(milesDriven != -1){
            System.out.println("Enter the number of gallons used: ");
            gallonUsed = input.nextInt();}
        }
        System.out.printf("The total miles per gallon for all trips is %.2f",total);

    }
}
