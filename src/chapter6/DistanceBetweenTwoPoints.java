package chapter6;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x1,x2,y1,y2 accordingly. Press enter after each entry");
        double x1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y1= input.nextDouble();
        double y2 = input.nextDouble();
        isDistanceBetweenTwoPoints(x1,x2,y1,y2);
    }
    public static void isDistanceBetweenTwoPoints(double x1,double x2,double y1,double y2){
        double result = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.printf("The distance between the two points is approximately %.2f ",result);
    }

}
