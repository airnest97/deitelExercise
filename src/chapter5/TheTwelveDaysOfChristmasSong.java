package chapter5;

import java.util.Scanner;

public class TheTwelveDaysOfChristmasSong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any day from the Christmas song (Enter 13 to stop)");
        int day = input.nextInt();
        while(day>=1 && day<=12) {
            switch (day) {
                case 1:
                    System.out.println("On the first day of Christmas my true love sent to me");
                    break;
                case 2:
                    System.out.println("On the second day of Christmas my true love sent to me");
                    break;
                case 3:
                    System.out.println("On the third day of Christmas my true love sent to me");
                    break;
                case 4:
                    System.out.println("On the fourth day of Christmas my true love sent to me");
                    break;
                case 5:
                    System.out.println("On the fifth day of Christmas my true love sent to me");
                    break;
                case 6:
                    System.out.println("On the sixth day of Christmas my true love sent to me");
                    break;
                case 7:
                    System.out.println("On the seventh day of Christmas my true love sent to me");
                    break;
                case 8:
                    System.out.println("On the eighth day of Christmas my true love sent to me");
                    break;
                case 9:
                    System.out.println("On the ninth day of Christmas my true love sent to me");
                    break;
                case 10:
                    System.out.println("On the tenth day of Christmas my true love sent to me");
                    break;
                case 11:
                    System.out.println("On the eleventh day of Christmas my true love sent to me");
                    break;
                case 12:
                    System.out.println("On the twelfth day of Christmas my true love sent to me");
                    break;
            }
            switch (day) {
                case 12:
                    System.out.println("Twelve drummers drumming ");
                case 11:
                    System.out.println("Eleven pipers piping");
                case 10:
                    System.out.println("Ten Lords a leaping ");
                case 9:
                    System.out.println("Nine ladies dancing ");
                case 8:
                    System.out.println("Eight maids are milking ");
                case 7:
                    System.out.println("Seven swans are swimming ");
                case 6:
                    System.out.println("Six geese a laying");
                case 5:
                    System.out.println("Five golden rings ");
                case 4:
                    System.out.println("Four calling birds ");
                case 3:
                    System.out.println("Three french hens ");
                case 2:
                    System.out.println("Two turtle doves ");
                case 1:
                    System.out.println("A partridge in a pear tree ");
                    break;
            }
            System.out.println("Enter any day from the Christmas song (Enter 13 to stop)");
            day = input.nextInt();
        }
    }
}
