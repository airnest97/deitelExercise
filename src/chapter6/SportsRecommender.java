package chapter6;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SportsRecommender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in degree celsius: ");
        int temperature = input.nextInt();
        sportRecommender(temperature);

    }
    public static void sportRecommender(int temperature){
        if (temperature >= 20 && temperature <= 30){
            System.out.println("It’s lovely weather for sports today");}
        else if (temperature >= 10 && temperature <= 40){
            System.out.println("It’s reasonable weather for sports today");}
        else System.out.println("Please exercise with care today, watch out for the weather!");
    }
}
