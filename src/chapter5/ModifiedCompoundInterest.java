package chapter5;

public class ModifiedCompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 0.05;
        System.out.printf("Year%5d percent%5d percent%5d percent%5d percent%5d percent%5d percent%n",5,6,7,8,9,10);
        for (int year = 1; year <= 10; year++) {
            for (int i = 1; i <= 1; i++) {
                double amount = principal * Math.pow(1 + 0.05, year);
                System.out.printf("%d       %.2f      ", year, amount);
            }
            getAmount(principal, 0.06, year);
            getAmount(principal, 0.07, year);
            getAmount(principal, 0.08, year);
            getAmount(principal, 0.09, year);
            getAmount(principal, 0.10, year);
            System.out.println();
        }

    }

    public static void getAmount(double principal, double rate, int year) {
        for (int i = 1; i <= 1; i++) {
            double amount = principal * Math.pow(1 + rate, year);
            System.out.printf("%.2f      ", amount);
        }
    }
}