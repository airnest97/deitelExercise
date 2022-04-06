package chapter5;

import java.util.Scanner;

public class GlobalWarmingFactsQuiz {
    private static int countCorrect = 0;

    public static void main(String[] args) {
        welcomeMessage();
        administerQuiz();
        showResult();
    }

    public static void welcomeMessage() {
        System.out.println("Welcome to Global Warming Facts Quiz!");
        System.out.println("You have five questions to prove how well you know about Global Warming.");
        System.out.println("Let's begin");
    }

    public static void administerQuiz() {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                1. Which of these countries has the highest per capital CO2 emission
                1.-> China
                2.-> India
                3.-> USA
                4.-> UK""");
        int option1 = input.nextInt();
        if (option1 == 3) {
            countCorrect++;
        }
        System.out.println("""
                2. In which European city did 196 nations agree on a landmark global plan to curb climate change in December 2015
                1.-> London
                2.-> Vienna
                3.-> Paris
                4.-> Bonn""");
        int option2 = input.nextInt();
        if (option2 == 2) {
            countCorrect++;
        }
        System.out.println("""
                3. How many people in the world are vulnerable to the effects of climate change
                1.-> Approximately 2 billion
                2.-> Approximately 4 billion
                3.-> Approximately 3 billion
                4.-> Approximately 5 billion""");
        int option3 = input.nextInt();
        if (option3 == 2) {
            countCorrect++;
        }
        System.out.println("""
                4. What is the name of the gas responsible for 75% of the warming effect from greenhouse gases
                1.-> H20
                2.-> C20
                3.-> C02
                4.-> H2SO4""");
        int option4 = input.nextInt();
        if (option4 == 3) {
            countCorrect++;
        }
        System.out.println("""
                5. Which of the following is not a fossil fuel
                1.-> Palm oil
                2.-> Coal
                3.-> Natural Gas
                4.-> Petrol""");
        int option5 = input.nextInt();
        if (option5 == 1) {
            countCorrect++;
        }
    }

    public static void showResult() {
        switch (countCorrect) {
            case 5 -> System.out.println("Excellent! You got all the questions correctly.");
            case 4 -> System.out.println("Very good! You got just one question wrong.");
            case 3, 2, 1 -> {
                System.out.println("Time to brush up on your knowledge on global warming");
                System.out.println("Kindly visit www.climate.nasa.gov or www.nrdc.org for more info");
            }
        }
    }
}

