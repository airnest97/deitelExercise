package chapter6;

public class CalculatingSumOfDigits {
    public static void main(String[] args) {
    isSumOfDigits(7631);
    }

    public static void isSumOfDigits(int number) {
        if (number > 1000 && number <= 9999) {
            int num4 = (number % 10);
            int num3 = (number % 100) / 10;
            int num2 = (number % 1000) / 100;
            int num1 = (number % 10000) / 1000;
            int sum = num1 + num2 + num3 + num4;
            System.out.println("The sum of the digits is " + sum);
        }
    }
}
