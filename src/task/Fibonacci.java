package task;

public class Fibonacci {
    public static void main(String[] args) {
     int a = 0; int b =1; int count = 13;

        System.out.println(a);

        for (int i = 1; i < count; i++) {
            System.out.println(b);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
