package chapter6;

public class PerfectNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            isPerfect(i);
        }
    }

    public static void isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= (number / 2); i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.println(number + " is a perfect number");

        System.out.print("The factors of "+number+" are ");

        for (int i = 1; i <= (number / 2); i++) {
            if (number % i == 0) {
                System.out.print(i + " ");}
            }
            System.out.println();
        }else System.out.println(number + " is NOT a perfect number");
    }
}
