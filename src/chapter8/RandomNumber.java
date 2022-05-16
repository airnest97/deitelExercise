package chapter8;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter lower limit of random number: ");
        int lowerLimit = input.nextInt();

        System.out.println("Enter upper limit of random number: ");
        int upperLimit = input.nextInt();

        SecureRandom rand = new SecureRandom();

        int randomNumber = rand.nextInt(lowerLimit, upperLimit);
        System.out.println(randomNumber);
    }
}
