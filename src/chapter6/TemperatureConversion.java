package chapter6;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in celsius: ");
        double celsius = input.nextDouble();
        kelvin(celsius);

        System.out.println("Enter temperature in kelvin: ");
        double kelvin = input.nextDouble();
        celsius(kelvin);
    }
    public static void kelvin(double celsius){
        double kelvin = celsius + 273.15;
        System.out.printf("The Kelvin equivalent of %.3f celsius is %.3fK %n",celsius,kelvin);
    }
    public static void celsius(double kelvin){
        double celsius = kelvin - 273.15;
        System.out.printf("The Celsius equivalent of %.3f kelvin is %.3f celsius %n",kelvin,celsius);
    }
}
