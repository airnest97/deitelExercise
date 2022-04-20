package assignment;

import java.util.Scanner;

public class ArrayStudentGrade01 {
    static int studentsNumber;
    static int subjectsNumber;
    static int[] totalPass = new int[3];
    static int[] totalFail = new int[3];
    static int[][] array = new int[3][3];
    static int[][] student = new int[3][1];
    static int[][] total = new int[3][1];
    static double[][] average = new double[3][1];
    static int[][] position = new int[3][1];
    static int[][] tempPosition = new int[3][2];

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of students ");
        studentsNumber = input.nextInt();

        System.out.println("Enter the number of subjects ");
        subjectsNumber = input.nextInt();

        enterGrade(studentsNumber, subjectsNumber);

        setTempPosition(studentsNumber);

        printTable();

        System.out.println("SUBJECT SUMMARY");
        subjectSummary(array, studentsNumber, 0);
        subjectSummary(array, studentsNumber, 1);
        subjectSummary(array, studentsNumber, 2);
        System.out.println(hardestSubject());
        System.out.println(easiestSubject());
        System.out.println(overHighestScore());
        System.out.println(overLowestScore());
        printShape();
        classSummary(total);
    }

    public static void enterGrade(int studentsNumber, int subjectsNumber) {
        for (int i = 0; i < studentsNumber; i++) {
            for (int a = 0; a < subjectsNumber; a++) {
                System.out.printf("Enter grade of student %d for subject %d%n", i + 1, 1 + a);
                int grade = input.nextInt();
                array[i][a] = grade;
                student[i][0] = i + 1;
            }
        }
        int sum;
        for (int i = 0; i < studentsNumber; i++) {
            sum = 0;
            for (int a = 0; a < subjectsNumber; a++) {
                sum = sum + array[i][a];
            }
            total[i][0] = sum;
            average[i][0] = ((sum + 0.0) / subjectsNumber);
        }
    }


    public static void printShape() {
        String shape = "=";
        System.out.print(shape.repeat(100));
    }

    public static void printShape2() {
        String shape = "!";
        System.out.print(shape.repeat(100));
    }

    public static void subjectSummary(int[][] array, int studentsNumber, int subjectPosition) {
        int columnSum = 0;
        double columnAverage = 0;
        int passes = 0;
        int fails = 0;
        int highestScore = array[0][subjectPosition];
        int lowestScore = array[0][subjectPosition];
        int highestScorer = 0;
        int lowestScorer = 0;
        for (int i = 0; i < studentsNumber; i++) {
            for (int j = subjectPosition; j <= subjectPosition; j++) {
                columnSum = columnSum + array[i][subjectPosition];
                if (array[i][j] >= 50) {
                    passes += 1;
                } else if (array[i][j] < 50) {
                    fails += 1;
                }
                if (array[i][j] >= highestScore) {
                    highestScore = array[i][j];
                    highestScorer = student[i][0];
                }
                if (array[i][j] <= lowestScore) {
                    lowestScore = array[i][j];
                    lowestScorer = student[i][0];
                }
            }
            totalPass[subjectPosition] = passes;
            totalFail[subjectPosition] = fails;
            columnAverage = (double) columnSum / studentsNumber;
        }
        System.out.println("Subject " + (subjectPosition + 1));
        System.out.println("Highest scoring student is: Student " + highestScorer + " scoring " + highestScore);
        System.out.println("Lowest scoring student is: Student " + lowestScorer + " scoring " + lowestScore);
        System.out.println("Total Score is: " + columnSum);
        System.out.println("Average Score is: " + columnAverage);
        System.out.println("Number of passes: " + passes);
        System.out.println("Number of Fails " + fails);
        System.out.println();
    }

    public static String hardestSubject() {
        int lowest = totalFail[0];
        int hardestSubject = 0;
        for (int i = 0; i < totalFail.length; i++) {
            if (totalFail[i] >= lowest) {
                lowest = totalFail[i];
                hardestSubject = i + 1;
            }
        }
        return "The hardest subject is " + " Subject " + hardestSubject + " with " + lowest + " failures";
    }

    public static String easiestSubject() {
        int highest = totalPass[0];
        int easiestSubject = 0;
        for (int i = 0; i < totalPass.length; i++) {
            if (totalPass[i] >= highest) {
                highest = totalPass[i];
                easiestSubject = i + 1;
            }
        }
        return "The easiest subject is " + " Subject " + easiestSubject + " with " + highest + " passes";
    }

    public static String overHighestScore() {
        int highestScore = array[0][0];
        int student = 0;
        int subject = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < subjectsNumber; j++) {
                if (array[i][j] > highestScore) {
                    highestScore = array[i][j];
                    student = i + 1;
                    subject = j + 1;
                }
            }
        }
        return "The overall Highest score is scored by Student " + student + " in Subject " + subject + " scoring " + highestScore;
    }

    public static String overLowestScore() {
        int lowestScore = array[0][0];
        int student = 0;
        int subject = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < subjectsNumber; j++) {
                if (array[i][j] < lowestScore) {
                    lowestScore = array[i][j];
                    student = i + 1;
                    subject = j + 1;
                }
            }
        }
        return "The overall Lowest score is scored by Student " + student + " in Subject " + subject + " scoring " + lowestScore;
    }

    public static void classSummary(int[][] total) {
        int bestScore = total[0][0];
        int bestScorer = 0;
        int worstScore = total[0][0];
        int worstScorer = 0;
        int totalScore = 0;
        double averageScore = 0;
        for (int i = 0; i < studentsNumber; i++) {
            for (int j = 0; j <= 0; j++) {
                totalScore = totalScore + total[i][j];
                averageScore = (double) totalScore / studentsNumber;
                if (total[i][j] >= bestScore) {
                    bestScore = total[i][j];
                    bestScorer = i + 1;
                }
                if (total[i][j] <= worstScore) {
                    worstScore = total[i][j];
                    worstScorer = i + 1;
                }
            }
        }
        System.out.println();
        System.out.println("CLASS SUMMARY");
        System.out.println();
        printShape();
        System.out.println();
        System.out.println("Best Graduating Student is: Student " + bestScorer + " scoring " + bestScore);
        System.out.println();
        printShape();
        System.out.println();
        printShape2();
        System.out.println();
        System.out.println(" Worst Graduating Student is: Student " + worstScorer + " scoring " + worstScore);
        printShape2();
        System.out.println();
        System.out.println();
        printShape();
        System.out.println();
        System.out.println("Class total score is: " + totalScore);
        System.out.println("Class Average score is: " + averageScore);
    }


    public static void printTable() {
        printShape();
        System.out.println();
        System.out.print("STUDENT  ");
        for (int i = 0; i < subjectsNumber; i++) {
            System.out.printf("%7s%d", "SUB", (i + 1));
        }
        System.out.printf("%8s", "TOT");
        System.out.printf("%9s", "AVG");
        System.out.printf("%8s", "POS");
        System.out.println();
        printShape();
        System.out.println();

        for (int i = 0; i < studentsNumber; i++) {
            System.out.print("student " + student[i][0]);
            for (int a = 0; a < subjectsNumber; a++) {
                System.out.printf("%7d", array[i][a]);
            }
            for (int a = 0; a < 1; a++) {
                System.out.printf("%11d", total[i][a]);
            }
            for (int a = 0; a < 1; a++) {
                System.out.printf("%10.2f", average[i][a]);
            }
            for (int a = 0; a < 1; a++) {
                System.out.printf("%6d", position[i][a]);
            }
            System.out.println();
        }
        printShape();
        System.out.println();
        printShape();
        System.out.println();
    }

    public static void setTempPosition(int studentsNumber) {
        for (int i = 0; i < studentsNumber; i++) {
            for (int j = 0; j <= 0; j++) {
                tempPosition[i][j] = total[i][j];
                tempPosition[i][1] = i + 1;
            }
        }
        boolean status = true;
        int temp;
        int temp2;
        while (status) {
            status = false;
            for (int i = 0; i < studentsNumber - 1; i++) {
                for (int j = 0; j < 1; j++) {
                    if (tempPosition[i + 1][j] > tempPosition[i][j]) {
                        temp = tempPosition[i + 1][j];
                        tempPosition[i + 1][j] = tempPosition[i][j];
                        tempPosition[i][j] = temp;
                        temp2 = tempPosition[i + 1][1];
                        tempPosition[i + 1][1] = tempPosition[i][1];
                        tempPosition[i][1] = temp2;
                        status = true;
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 1; j++) {
                position[i][0] = tempPosition[i][j];
            }
        }
    }
}
