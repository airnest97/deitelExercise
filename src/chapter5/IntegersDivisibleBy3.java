package chapter5;

public class IntegersDivisibleBy3 {
    public static void main(String[] args) {
       int sum = 0;
        for (int i= 1; i<=30; i++){
            if(i%3==0){sum = sum + i;}
        }
        System.out.println("The sum of numbers between 1 and 30 divisible by 3 is: "+sum);
    }
}
