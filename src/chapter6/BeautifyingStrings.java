package chapter6;

import java.util.Scanner;

public class BeautifyingStrings {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        beautifyingString();
    }








    public static void beautifyingString(){
        System.out.println("Enter any phrase or sentence: ");
        String theString = input.nextLine();

        if(theString.charAt(theString.length()-1) != '.'){
            theString = theString + '.';
        }

        char firstDigit = theString.toUpperCase().charAt(0);
        System.out.print(firstDigit);

        for (int i = 1; i < theString.length(); i++) {
            System.out.print(theString.charAt(i));
        }

    }

}


