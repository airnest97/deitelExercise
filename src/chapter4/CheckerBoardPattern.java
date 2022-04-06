package chapter4;

public class CheckerBoardPattern {
    public static void main(String[] args) {
        for(int i =1; i<=8; i++){
            for(int j = 1; j<=8; j++){
                System.out.print("* ");
                }
           if (i % 2 != 0){
            System.out.println();
            System.out.print(" ");}
           else System.out.println();
        }
        }
    }

