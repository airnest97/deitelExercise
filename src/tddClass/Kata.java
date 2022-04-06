package tddClass;

public class Kata {
    public int getSum(int value1, int value2) {
        return value1 + value2;
    }

    public int getSubtraction(int value1, int value2) {
        return value1 - value2;
    }

    public double getArea(int value1) {
        return Math.PI * value1 * value1;
    }

    public int getFlipValue(int value) {
        if (value == 0)
            return 1;
        if (value == 1) return 0;
        else return value;
    }

    public boolean isPalindrome(int value) {
        int firstDigit = value / 100000;
        int secondDigit = (value % 100000) / 10000;
        int thirdDigit = (value % 10000) / 1000;
        int fourthDigit = (value % 1000) / 100;
        int fifthDigit = (value % 100) / 10;
        int sixthDigit = value % 10;

        return firstDigit == sixthDigit && secondDigit == fifthDigit && thirdDigit == fourthDigit;
    }

    public int getQuantity(int quantity) {
        if (quantity >= 1 && quantity <= 4)
            return quantity * 2000;
        else if (quantity >= 5 && quantity <= 9)
            return quantity * 1800;
        else if (quantity >= 10 && quantity <= 29)
            return quantity * 1600;
        else if (quantity >= 30 && quantity <= 49)
            return quantity * 1500;
        else if (quantity >= 50 && quantity <= 99)
            return quantity * 1300;
        else if (quantity >= 100 && quantity <= 199)
            return quantity * 1200;
        else if (quantity >= 200 && quantity <= 499)
            return quantity * 1100;
        else if (quantity >= 500)
            return quantity * 1000;
        else
            return 0;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int calculateTheLargestNumber(int number1, int number2, int number3, int number4, int number5) {
        if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5)
            return number1;
        if (number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5)
            return number2;
        if (number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5)
            return number3;
        if (number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5)
            return number4;
        return number5;
    }

    public int calculateTheLargestInteger(int num1, int num2, int num3, int num4, int num5) {
        int largestNumber = num1;

        if (largestNumber < num2)
            largestNumber = num2;

        if (largestNumber < num3)
            largestNumber = num3;

        if (largestNumber < num4)
            largestNumber = num4;

        if (largestNumber < num5)
            largestNumber = num5;

        return largestNumber;
    }

    public int factorsOf(int number) {

        int i = 1;
        int count = 0;
        while (i <= number) {
            if (number % i == 0) {
                count++;
            }
                i++;
        }
        return count;
    }

    public boolean isAPrimeNumber(int number) {

        return factorsOf(number) <= 2;
    }

    public int getFactorialOf(int number) {
        int factorial = 1;
        for (int i = 1; i <= number ; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public int findMaximumFrom(int[] scores) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] > max)
                max = scores[i];
        }
        return max;
    }

    public int findMinimumFrom(int[] scores) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < scores.length; i++) {
            if(min > scores[i])
                min = scores[i];
        }
        return min;
    }

    public double findAverageFrom(int[] scores) {
        int sum = 0; double average = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
            average = (double)sum / scores.length;
        }
        return average;
    }

    public int findSumFrom(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        return sum;
    }
}
