package chapter5;

public class PythagoreanTriples {
    public static void main(String[] args) {
        System.out.println("side1       side2    hypotenuse");
        for (int i = 1; i <= 500; i++) {
            for (int j = 1; j <= 1; j++) {
                double k = Math.sqrt((i*i)+(i*i));
                System.out.printf("%4d%11d        %.2f%n",i,i,k);
            }
        }
    }
}
