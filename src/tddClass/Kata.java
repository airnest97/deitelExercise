package tddClass;

public class Kata {
    public int getSum(int value1, int value2) {
        return value1 + value2;
    }

    public int getSubtraction(int value1, int value2) {
        return value1 - value2;
    }

    public double getArea( int value1) {
        return Math.PI * value1 * value1;
    }

    public int getFlipValue(int value) {if(value == 0)
        return 1; if(value == 1) return 0; else return value;
    }

    public boolean isPalindrome(int value) {
        int firstDigit = value / 100000;
        int secondDigit = (value % 100000) / 10000;
        int thirdDigit = (value % 10000) / 1000;
        int fourthDigit = (value % 1000) / 100;
        int fifthDigit = (value % 100) / 10;
        int sixthDigit = value % 10;

        if(firstDigit == sixthDigit && secondDigit == fifthDigit && thirdDigit == fourthDigit)
        return true;
        else return false;
    }

    public int getQuantity(int quantity) {
        if(quantity >= 1 && quantity <= 4)
            return quantity * 2000;
        else
            if(quantity >= 5 && quantity <= 9)
                return quantity * 1800;
            else
                if(quantity >= 10 && quantity <= 29)
                    return quantity * 1600;
                else
                    if(quantity >= 30 && quantity <= 49)
                        return quantity * 1500;
                    else
                        if(quantity >= 50 && quantity <= 99)
                            return quantity * 1300;
                        else
                             if(quantity >= 100 && quantity <= 199)
                                 return quantity * 1200;
                             else
                                 if(quantity >= 200 && quantity <= 499)
                                     return quantity * 1100;
                                 else
                                     if(quantity >= 500)
                                         return quantity * 1000;
                                     else
                                         return 0;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}


