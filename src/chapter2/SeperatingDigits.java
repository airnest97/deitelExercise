package chapter2;

import java.util.Scanner;

public class SeperatingDigits{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Input the number consisting of 5 digits: ");
	int theNumber = input.nextInt();
    if (theNumber < 10000) {System.out.println("Check again and enter a five digit number ");}

    int mod1 = theNumber%10;
    int mod2 = theNumber%100;
    int mod3 = theNumber%1000;
    int mod4 = theNumber%10000;
    int mod5 = theNumber%100000;

    int new5 = mod5/10000;
    int new4 = mod4/1000;
    int new3 = mod3/100;
    int new2 = mod2/10;
    int new1 = mod1/1;

    System.out.printf("%d   %d   %d   %d   %d",new5,new4,new3,new2,new1);



}
}
