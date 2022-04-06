package chapter4;

public class TabularOutput {
    public static void main(String[] args) {
        int counter = 1;
        System.out.printf("N    N2    N3    N4%n");
        for(int i =1; i<=5; i++){
            int N = i;
            int N2 = i*i;
            int N3 = i*i*i;
            int N4 = i*i*i*i;
            System.out.printf("%d%5d%6d%6d%n",N,N2,N3,N4);}
    }
}
