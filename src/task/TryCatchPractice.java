package task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchPractice {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            int we = scanner.nextInt();

            System.out.println(we);
        }
        catch (InputMismatchException e){
            System.out.println(e.getStackTrace());
        }
    }
}