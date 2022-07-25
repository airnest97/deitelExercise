package chapter15;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FormatterPractice {
    public static void main(String[] args){
        try (
            Scanner scanner = new Scanner(System.in);
            Formatter formatter = new Formatter("output.txt")
        ){
            System.out.println("Enter your first name, last name and date of birth");
            System.out.println("Enter end of file marker to signal end of output");

            while (scanner.hasNext()){
                try {
                    formatter.format("First name: %s\nLast name: %s\nDate of birth: %s\n",
                            scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
                }catch (NoSuchElementException e){
                    System.out.println("Invalid input!");
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
