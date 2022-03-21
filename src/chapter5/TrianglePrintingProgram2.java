package chapter5;

public class TrianglePrintingProgram2 {
    public static void main(String[] args) {

        for (int row = 0; row < 10; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print("* ");
            }
            for (int column1 = row; column1 <= 10 ; column1++) {
                System.out.print("  ");
            }
            for (int column = 10; column > row; column--) {
                System.out.print("* ");
            }
            for (int column2 = 0; column2 <= row; column2++) {
                System.out.print("  ");
            }
            for (int column1 = 0; column1 <= row ; column1++) {
                System.out.print("  ");
            }
            for (int column = row; column < 10 ; column++) {
                System.out.print("* ");
            }
            for (int column = 10; column > row; column--) {
                System.out.print("  ");
            }
            for (int column2 = 0; column2 <= row; column2++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
