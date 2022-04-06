package chapter4;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the x value of the first point ");
        int x1 = input.nextInt();

        System.out.println("Enter the y value of the first point ");
        int y1 = input.nextInt();

        System.out.println("Enter the x value of the first point ");
        int x2 = input.nextInt();

        System.out.println("Enter the y value of the first point ");
        int y2 = input.nextInt();

        if(x1==x2 || y1==y2){
            System.out.println("The two points are located on a line perpendicular to an axis.");
        }
        else System.out.println("The two points are not located on a line perpendicular to an axis.");
    }
}
