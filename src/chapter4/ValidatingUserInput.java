package chapter4;

import java.util.Scanner;

public class ValidatingUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int passes = 0;
        int failure = 0;

        while (counter <= 10) {
            System.out.println("Enter result (1 = pass  2 = fail) ");
            int result = input.nextInt();

                    if (result == 1) {
                        passes++;
                    } else if (result == 2) {
                        failure++;
                    }

            if (result != 1 && result != 2) {
                System.out.println("Enter the correct digit");
                counter = counter -1;
            }
            counter = counter + 1;
        }
        System.out.printf("Passed: %d%n Failed: %d%n", passes, failure);

        if (passes > 8) {
            System.out.println("Bonus to instructor");
        }
    }
}
