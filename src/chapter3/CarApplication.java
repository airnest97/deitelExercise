package chapter3;

import java.util.Scanner;

public class CarApplication {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "2019", 20000);
        Car car2 = new Car("Honda", "2012", 11000);


        System.out.printf("The price of the first car is %.2f%n", car1.getPrice());
        System.out.printf("The price of the second car is %.2f%n", car2.getPrice());

        System.out.printf("The price of the first car after 5percent discount is %.2f%n", car1.getFivePercent());
        System.out.printf("The price of the second car after 7percent discount is %.2f%n", car2.getSevenPercent());

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the car model: %n");
        String model1 = input.nextLine();

        car1.setModel(model1);

        System.out.printf("Enter the car year: %n");
        String year1 = input.nextLine();

        System.out.printf("Enter the car price: %n");
        double price1 = input.nextDouble();

        car1.setPrice(price1);

        System.out.printf("The new car model for car1 is %s%n",car1.getModel());
        System.out.printf("The new car year for car1 is %s%n",car1.getYear());
        System.out.printf("The new car price for car1 is %.2f%n",car1.getPrice());








    }
}