package task;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

    private static String [] firstNames = new String[10];
    private static String [] lastNames = new String[10];
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        for (int i = 0; i < firstNames.length; i++) {
            System.out.println(i+1 + "." + " Enter first name: ");
            String firstName = input.nextLine();
            System.out.println("Enter last name: ");
            String lastName = input.nextLine();
            addName(firstName, lastName, i);
        }
        System.out.println(Arrays.toString(firstNames));
        System.out.println(Arrays.toString(lastNames));
    }

    public static void addName(String firstName, String lastName, int index) {
        firstNames[index] = firstName;
        lastNames[index] = lastName;
    }
}
