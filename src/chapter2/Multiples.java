package chapter2;

import java.util.Scanner;
public class Multiples{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the first integer: ");
	int num1 = input.nextInt();

	
	System.out.print("Enter the second integer: ");
	int num2 = input.nextInt();

	int tripled = num1 * num1 * num1;
	int doubled = num2 * num2;

	if (tripled % doubled == 0) {System.out.printf("%d is a multiple of %d, answer is %d%n", tripled,doubled, tripled/doubled);}
	if (tripled % doubled != 0) {System.out.printf("%d is not a multiple of %d%n", tripled,doubled);}
}
}