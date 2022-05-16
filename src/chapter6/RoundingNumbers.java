package chapter6;

public class RoundingNumbers {
    public static void main(String[] args) {
        roundToInteger(0.5);
        roundToTenths(2.345);
        roundToHundredths(34.567);
        roundToThousandths(5.6778);
        System.out.println();
        System.out.println();
        roundNumber(45.6678);

    }
    public static void roundToInteger(double value){
        double y = Math.floor(value + 0.5);
        System.out.println("The original number is "+value+" and the rounded number is "+(int)y);}

    public static void roundToTenths(double value){
        double y = Math.floor((value * 10) + 0.5)/10;
        System.out.println("The original number is "+value+" and the rounded number is "+y);}

    public static void roundToHundredths(double value){
        double y = Math.floor((value * 100) + 0.5)/100;
        System.out.println("The original number is "+value+" and the rounded number is "+y);}

    public static void roundToThousandths(double value){
        double y = Math.floor((value * 1000) + 0.5)/1000;
        System.out.println("The original number is "+value+" and the rounded number is "+y);}

    public static void roundNumber(double value){
        double y = Math.floor(value + 0.5);
        double yTenths = Math.floor((value * 10) + 0.5)/10;
        double yHundredths = Math.floor((value * 100) + 0.5)/100;
        double yThousandths = Math.floor((value * 1000) + 0.5)/1000;

        System.out.println("The original number is "+value );
        System.out.println("Its rounded figure to nearest integer is "+(int)y);
        System.out.println("Its rounded figure to nearest Tenth is "+yTenths);
        System.out.println("Its rounded figure to nearest Hundredth is "+yHundredths);
        System.out.println("Its rounded figure to nearest Thousandth is "+yThousandths);
  }
}

