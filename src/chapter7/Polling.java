package chapter7;

import java.util.Scanner;

public class Polling {
    private static final String[] topics = new String[5];
    private static final int[][] responses = new int[5][10];
    private static final int[] total = new int[5];
    private static final double[] Average = new double[5];
    private static final Scanner input = new Scanner(System.in);
    private static int highestTotal = 0;
    private static String highestIssue = "";
    private static int lowestTotal = 0;
    private static String lowestIssue = "";
    public static void main(String[] args) {
        loadTopics();
        collectInputForRatings();
        computeTotalAndAverage();
        printTable();
        printResult();
    }

    public static void loadTopics(){
        topics[0] = "Poverty";
        topics[1] = "Racism";
        topics[2] = "Malnutrition";
        topics[3] = "Overpopulation";
        topics[4] = "Gender Inequality";
    }
    public static void collectInputForRatings() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome User " + (i + 1));
            System.out.println("Enter your rating for each issue:");
            System.out.println("Choose from 1 (least important) to 10(most important)");
            for (int j = 0; j < 5; j++) {
                System.out.println("Enter your rating for " + topics[j]);
                responses[j][i] = input.nextInt();
            }
        }
    }

        public static void computeTotalAndAverage(){
            for (int i = 0; i < 5 ; i++) {
                int sum = 0;
                for (int j = 0; j < 10; j++) {
                    sum = sum + responses[i][j];
                }
                total[i] = sum;
                if (total[i] > highestTotal){
                    highestTotal = total[i];
                highestIssue = topics[i];
                }
                Average[i] = (double) sum/Average.length;
            }
            lowestTotal = total[0];
            lowestIssue = topics[0];
                for (int j = 0; j < 5; j++) {
                    if (total[j] <= lowestTotal){
                        lowestTotal = total[j];
                        lowestIssue = topics[j];
                    }

                }
            }
    public static void printTable(){
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d. %18s",(i+1),topics[i]);

            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d   ",responses[i][j]);
            }
            System.out.printf("%3d   ",total[i]);

            System.out.printf("%2.2f   ",Average[i]);

            System.out.println();
        }
    }
    public static void printResult(){
        System.out.printf("The highest total points is %s with %d points%n",highestIssue,highestTotal);
        System.out.printf("The lowest total points is %s with %d points",lowestIssue,lowestTotal);
    }

}
