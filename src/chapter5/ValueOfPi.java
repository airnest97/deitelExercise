package chapter5;

public class ValueOfPi {
    public static void main(String[] args) {
        int numerator = 4;
        double init = 0;
        double pi = 1;

        for(int i = 1; i<=4;i+=1){
            init = init + (double)numerator/i;
        }
        System.out.println(init);

    }
}
