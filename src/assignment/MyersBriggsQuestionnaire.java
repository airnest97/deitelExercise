package assignment;

import java.util.Objects;
import java.util.Scanner;

public class MyersBriggsQuestionnaire {
   static  Scanner scanner = new Scanner(System.in);
   static int countA1 = 0;
   static int countB1 = 0;
   static int countA2 = 0;
   static int countB2 = 0;
   static int countA3 = 0;
   static int countB3 = 0;
   static int countA4 = 0;
   static int countB4 = 0;
   static  String userInput;

    public static void main(String[] args) {
        questionnaire();
        questionnaireResult();
    }

    private static void questionnaire() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Choose either A or B");
            switch (i) {
                case 1 -> {
                    System.out.println("""
                                    1.
                            A. Expend energy, Enjoy groups
                            B. Conserve energy, enjoy one-on-one
                            """);
                    userInput = scanner.next();
                    if (Objects.equals(userInput.toUpperCase(), "A")) countA1++;
                    else countB1++;
                }
                case 2 -> {
                    System.out.println("""
                                    2.
                            A. Interpret literally
                            B. Look for meaning and possibilities
                            """);
                    userInput = scanner.next();
                    if (Objects.equals(userInput.toUpperCase(), "A")) countA2++;
                    else countB2++;
                }
                case 3 -> {
                    System.out.println("""
                                    3.
                            A. Logical, thinking, questioning
                            B. Empathetic, Feeling and accommodating
                            """);
                    userInput = scanner.next();
                    if (Objects.equals(userInput.toUpperCase(), "A")) countA3++;
                    else countB3++;
                }
                case 4 -> {
                    System.out.println("""
                                    4.
                            A. Organized, orderly
                            B. Flexible, adaptable
                            """);
                    userInput = scanner.next();
                    if (Objects.equals(userInput.toUpperCase(), "A")) countA4++;
                    else countB4++;
                }
                case 5 -> {
                    System.out.println("""
                                    5.
                            A. More outgoing,think out loud
                            B. More reserved, think to yourself
                            """);
                    userInput = scanner.next();
                    if (Objects.equals(userInput.toUpperCase(), "A")) countA1++;
                    else countB1++;
                }
                case 6 -> {
                    System.out.println("""
                                    6.
                            A. Practical, realistic and experiential
                            B. Imaginative, innovative, theoretical
                            """);
                    userInput = scanner.next();
                    if (Objects.equals(userInput.toUpperCase(), "A")) countA2++;
                    else countB2++;
                }
                case 7 -> {
                    System.out.println("""
                                    7.
                            A. Candid, straight forward, frank
                            B. Tactful, kind, encouraging
                            """);
                    userInput = scanner.next();
                    if (Objects.equals(userInput.toUpperCase(), "A")) countA3++;
                    else countB3++;
                }
                case 8 -> {
                    System.out.println("""
                                    8.
                            A. Plan, schedule
                            B. unplanned, spontaneous
                            """);
                    userInput = scanner.next();
                    if (Objects.equals(userInput.toUpperCase(), "A")) countA4++;
                    else countB4++;
                }
                case 9 -> {
                    System.out.println("""
                                    9.
                            A. Seek many tasks, public activities, standard interaction with others
                            B. seek private, solitary activities with quiet to concentrate
                            """);
                    userInput = scanner.next();
                    if (Objects.equals(userInput.toUpperCase(), "A")) countA1++;
                    else countB2++;
                }
                case 10 -> {
                    System.out.println("""
                                    10.
                            A. Standard usual, conventional
                            B. Different, novel, unique
                            """);
                    userInput = scanner.next();
                    if (Objects.equals(userInput.toUpperCase(), "A")) countA2++;
                    else countB2++;
                }
                case 11 -> {
                    System.out.println("""
                                    11.
                            A. Firm, tend to criticise, hold the line
                            B. Gentle, tend to appreciate, conciliate
                            """);
                    userInput = scanner.next();
                    if (Objects.equals(userInput.toUpperCase(), "A")) countA3++;
                    else countB3++;
                }
                case 12 -> {
                    System.out.println("""
                                    12.
                            A. Regulated, structured
                            B. Easygoing, "live" and "let live"
                            """);
                    userInput = scanner.next();
                    if (Objects.equals(userInput.toUpperCase(), "A")) countA4++;
                    else countB4++;
                }
                case 13 -> {
                    System.out.println("""
                                    13.
                            A. External, communicative, express yourself
                            B. Internal, reticent, keep to yourself
                            """);
                    userInput = scanner.next();
                    if (Objects.equals(userInput.toUpperCase(), "A")) countA1++;
                    else countB1++;
                }
                case 14 -> {
                    System.out.println("""
                                    14.
                            A. Focus on here-and-now
                            B. Look to the future, global perspective, "big picture"
                            """);
                    userInput = scanner.next();
                    if (Objects.equals(userInput.toUpperCase(), "A")) countA2++;
                    else countB2++;
                }
                case 15 -> {
                    System.out.println("""
                                    15.
                            A. Tough-minded, just
                            B. Tender-hearted, merciful
                            """);
                    userInput = scanner.next();
                    if (Objects.equals(userInput.toUpperCase(), "A")) countA3++;
                    else countB3++;
                }
                case 16 -> {
                    System.out.println("""
                                    16.
                            A. Preparation, plan ahead
                            B. Go with the flow, adapt as you go
                            """);
                    userInput = scanner.next();
                    if (Objects.equals(userInput.toUpperCase(), "A")) countA4++;
                    else countB4++;
                }
                case 17 -> {
                    System.out.println("""
                                    17.
                            A. Active, initiate
                            B. Reflective, deliberate
                            """);
                    userInput = scanner.next();
                    if (Objects.equals(userInput.toUpperCase(), "A")) countA1++;
                    else countB1++;
                }
                case 18 -> {
                    System.out.println("""
                                    18.
                            A. Facts, things, "what is"
                            B. Ideas, dreams, "what could be", philosophical
                            """);
                    userInput = scanner.next();
                    if (Objects.equals(userInput.toUpperCase(), "A")) countA2++;
                    else countB2++;
                }
                case 19 -> {
                    System.out.println("""
                                    19.
                            A. Matter of fact, issue-oriented
                            B. Sensitive, people-oriented, compassionate
                            """);
                    userInput = scanner.next();
                    if (Objects.equals(userInput.toUpperCase(), "A")) countA3++;
                    else countB3++;
                }
                case 20 -> {
                    System.out.println("""
                                    20.
                            A. Control, govern
                            B. Latitude, freedom
                            """);
                    userInput = scanner.next();
                    if (Objects.equals(userInput.toUpperCase(), "A")) countA4++;
                    else countB4++;
                }
            }
        }
    }

    private static void questionnaireResult() {
        if(countA1 > countB1) System.out.print("E " );
        else System.out.print("I ");
        if(countA2 > countB2) System.out.print("S ");
        else System.out.print("N ");
        if(countA3 > countB3) System.out.print("T ");
        else System.out.print("F ");
        if(countA4 > countB4) System.out.print("J ");
        else System.out.print("P ");
    }

}
