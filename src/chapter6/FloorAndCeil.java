package chapter6;

import java.util.Scanner;

public class FloorAndCeil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Enter any double value: ");
            double Number = input.nextDouble();
        System.out.println("The myCeil Value of "+ Number+ " is "+myCeil(Number));
        System.out.println("The myFloor Value of "+ Number+ " is "+myFloor(Number));
    }
    public static int myFloor(double value){
        int x = (int)(value * 10);
        return (x/10);}
    public static int myCeil(double value){
        int y = (int)(value * 10);
        return (y/10) + 1;}
}
