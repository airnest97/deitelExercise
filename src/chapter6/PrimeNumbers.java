package chapter6;

public class PrimeNumbers {
    public static void main(String[] args) {
        isPrime(7);
        isPrime(6);
        isPrime(11);

    }
    public static void isPrime(int number) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                count +=1;
            }
        }
        if (count <= 1){
            System.out.println(number + " is a prime number");
        }
        else System.out.println(number + " is NOT a prime number");
    }
}
