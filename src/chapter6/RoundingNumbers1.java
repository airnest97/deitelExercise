package chapter6;

import java.util.Scanner;

public class RoundingNumbers1 {
    public static void main(String[] args) {
        roundToInteger(5.678);
        roundToInteger(2.3445);
        roundToInteger(1.67884);
    }

    public static void roundToInteger(double value){
        double y = Math.floor(value + 0.5);
        System.out.println("The original number is "+value+" and the rounded number is "+(int)y);}
}
