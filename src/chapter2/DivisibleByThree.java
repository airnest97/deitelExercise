package chapter2;//To determine whether an integer is divisble by three
import java.util.Scanner;
public class DivisibleByThree{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int num = input.nextInt();

	if (num % 3 == 0) {System.out.printf("%d is divisible by 3",num);}
	if (num % 3 != 0) {System.out.printf("%d is not divisible by 3",num);}
	}
}