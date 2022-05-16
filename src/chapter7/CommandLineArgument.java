package chapter7;

public class CommandLineArgument {
    public static void main(String[] args) {
        if (args.length > 6){
            System.out.println("Error: Please re-enter the entire command");
            System.out.println("""
                    six numbers""");}
        else{

            int firstNumber = Integer.parseInt(args[0]);
            int secondNumber = Integer.parseInt(args[1]);
            int thirdNumber = Integer.parseInt(args[2]);
            int fourthNumber = Integer.parseInt(args[3]);
            int fifthNumber = Integer.parseInt(args[4]);
            int sixthNumber = Integer.parseInt(args[5]);

            int maximumNumber = Math.max(Math.max(Math.max(firstNumber,secondNumber),Math.max(thirdNumber,fourthNumber)),Math.max(fifthNumber,sixthNumber));
            int minimumNumber = Math.min(Math.min(Math.min(thirdNumber,fourthNumber),Math.min(firstNumber, secondNumber)), Math.min(fifthNumber,sixthNumber));

            double average = (maximumNumber + minimumNumber)/2.0;
            System.out.printf("The average of the numbers is approximately %.2f ",average);

        }
    }
}
