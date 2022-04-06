package chapter5;

public class diamondPrinting {
    public static void main(String[] args) {
        for(int i= 1; i <= 5; i++){
            for(int j = i; j <= 5; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("x ");
            }
            for(int j = 1; j < i; j++){
                System.out.print("x ");
            }
            System.out.println();
        }
        for(int i= 4; i >= 1; i--){
            for(int j = i; j <= 5; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("x ");
            }
            for(int j = 1; j < i; j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
