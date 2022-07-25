package tddClass;

public class Palindrome {

    public boolean isPalindrome(int num) {
        int firstDigit = num / 100000;
        int secondDigit = (num % 100000) / 10000;
        int thirdDigit = (num % 10000) / 1000;
        int fourthDigit = (num % 1000) / 100;
        int fifthDigit = (num % 100) / 10;
        int sixthDigit = num % 10;

        return firstDigit == sixthDigit && secondDigit == fifthDigit && thirdDigit == fourthDigit;
    }
}
