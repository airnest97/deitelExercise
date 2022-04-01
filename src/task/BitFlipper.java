package task;

import java.util.Scanner;

public class BitFlipper {
    public static void main(String[] args) {
        Scanner collector = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int value = collector.nextInt();

        if (value == 1)
        {System.out.println(0);}

        if (value == 0)
        {System.out.println(1);}

        else
            System.out.print("Enter a number between 0 and 1; ");
    }

}
