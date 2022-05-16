package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] theArray = new int[10];
        Arrays.fill(theArray, -1);

        for (int i = 0; i < theArray.length; i++) {
            System.out.println("Enter number: ");
            int theNumber = input.nextInt();
            theArray[i] = theNumber;
        }
        System.out.println(Arrays.toString(theArray));

        for (int i = 0; i < theArray.length; i++) {
            for (int j = i+1; j < theArray.length; j++) {
               if(theArray[i] == theArray[j]){
                   System.out.println("Enter another number to replace "+theArray[j]+". It is repeated");
                   theArray[j] = input.nextInt();
               }
            }
        }
        System.out.println(Arrays.toString(theArray));
    }
}
