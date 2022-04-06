package chapter4;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        System.out.println("Hello, Please enter your name:");
        String name = input.nextLine();

        System.out.printf("Welcome %s, Enter the item number (1 - 4) of all the items you sold last week%n", name);
        System.out.println("Enter -1 to display your earnings for last week");
        int item = input.nextInt();

        while (item != -1){

        switch(item){
            case 1:
                count1++;
                break;
            case 2:
                count2++;
                break;
            case 3:
                count3++;
                break;
            case 4:
                count4++;
                break;
            default:
                System.out.println("Enter a valid item number");
                break;}
                System.out.println("Enter the next item number (1 - 4) of all the items you sold last week");
                System.out.println("Enter -1 to display your earnings for last week");
                item = input.nextInt();}

        double totalEarnings = 200 + (0.09 * ((item1 * count1) + (item2 * count2) + (item3 * count3) + (item4 * count4)));

        System.out.printf("%s, your earning for last week was $%.2f: ",name, totalEarnings);
    }
}