package chapter5;

public class SumOfASeries {
    public static void main(String[] args) {
        long sum = 0;
        long product = 1;
        System.out.println("number       sum       product");
        for (long i= 1; i<=100; i++){
           for(long j = 1; j<=1; j++){
               System.out.print(i);}
           for(long k = 1; k<=1; k++){
               System.out.print("             ");
           }
            for(long j = 1; j<=1; j++){
                sum = sum + i;
                System.out.print(sum);}
            for(long k = 1; k<=1; k++){
                System.out.print("           ");
            }
            for(long j = 1; j<=1; j++){
                product = product * i;
                System.out.print(product);}
            System.out.println();
        }
        }
    }
    //The difficulty encountered with accumulating products was that:
//          the product of the accumulated values exceeded the limit for long.

