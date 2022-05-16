package chapter6;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        while(count <= 3){
            System.out.println("Input first Number:");
            int firstInteger = input.nextInt();

            System.out.println("Input second Number:");
            int secondInteger = input.nextInt();
            System.out.println(isMultiples(firstInteger,secondInteger));
            count++;
        }

    }
    public static boolean isMultiples(int firstInteger, int secondInteger) {
        if (secondInteger % firstInteger == 0) {
            return true;
        }
        return false;
    }

}
