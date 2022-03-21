package chapter5;


public class TheTwelveDaysOfChristmasSong {
    public static void main(String[] args) {


//        int day = 1;
//        while( day<=12) {
        for (int day = 1; day <= 12; day++) {
            switch (day) {
                case 1 -> System.out.println("On the first day of Christmas my true love sent to me");
                case 2 -> System.out.println("On the second day of Christmas my true love sent to me");
                case 3 -> System.out.println("On the third day of Christmas my true love sent to me");
                case 4 -> System.out.println("On the fourth day of Christmas my true love sent to me");
                case 5 -> System.out.println("On the fifth day of Christmas my true love sent to me");
                case 6 -> System.out.println("On the sixth day of Christmas my true love sent to me");
                case 7 -> System.out.println("On the seventh day of Christmas my true love sent to me");
                case 8 -> System.out.println("On the eighth day of Christmas my true love sent to me");
                case 9 -> System.out.println("On the ninth day of Christmas my true love sent to me");
                case 10 -> System.out.println("On the tenth day of Christmas my true love sent to me");
                case 11 -> System.out.println("On the eleventh day of Christmas my true love sent to me");
                case 12 -> System.out.println("On the twelfth day of Christmas my true love sent to me");
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

//                    day++;
//            }
            }
            System.out.println();
        }
    }
}
