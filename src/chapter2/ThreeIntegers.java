package chapter2;//To find the largest and smallest of three integers
import java.util.Scanner;
public class ThreeIntegers{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter first Integer: ");
	int num1 = input.nextInt();

	System.out.println("Enter second Integer: ");
	int num2 = input.nextInt();

	System.out.println("Enter third Integer: ");
	int num3 = input.nextInt();

	int largest = num1;
	if (num2 > num1) {largest = num2;}
	if (num3 > num2) {largest = num3;}

	int smallest = num3;
	if (num3 > num2) {smallest = num2;}
	if (num2 > num1) {smallest = num1;}

	System.out.println(" The Largest of the three integers is; "+largest);
	System.out.println(" The Smallest of the three integers is; "+smallest);
}
}