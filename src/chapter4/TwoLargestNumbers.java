package chapter4;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0;
        int secondLargest = 0;

        for(int i =1; i<= 10; i++){
            System.out.println("Enter the number");
            int number = input.nextInt();
            if(number > largest){
                secondLargest = largest;
                largest = number;
            }
            else if (number > secondLargest ){
                secondLargest = number;
            }

        }
        System.out.println("The largest number is "+largest+ " and the second largest is "+secondLargest);
        }

    }
