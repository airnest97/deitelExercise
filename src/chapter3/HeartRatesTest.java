package chapter3;

import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args){
        HeartRates user1 = new HeartRates("Adewale","Adeyinka",
                1995,2,13,2022);
        System.out.printf("%s %s is %d years old. %n",user1.getFirstName(),user1.getLastName(),user1.getCurrentAge());
        System.out.printf("He has a maximum heart rate of %.2fbeats per minute and a target heart rate of %.2fbeats per minutes%n"
                ,user1.maximumHeartRate(),user1.targetHeartRate());
        System.out.printf("%n");
        System.out.printf("Let's try yours!%n");
        System.out.printf("%n");
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter your first name;%n");
        String firstName = input.nextLine();
        user1.setFirstName(firstName);

        System.out.printf("Enter your last name;%n");
        String lastName = input.nextLine();
        user1.setLastName(lastName);

        System.out.printf("Enter your year of birth: ;%n");
        int birthYear = input.nextInt();
        user1.setYearOfBirth(birthYear);

        System.out.printf("Enter your month of birth: ;%n");
        int birthMonth = input.nextInt();
        user1.setMonthOfBirth(birthMonth);

        System.out.printf("Enter your day of birth: ;%n");
        int birthDay = input.nextInt();
        user1.setDayOfBirth(birthDay);

        System.out.printf("Enter the current year you are in: ;%n");
        int currentYear = input.nextInt();
        user1.setCurrentYear(currentYear);

        System.out.printf("Your name is %s %s and you are %d years old %n",user1.getFirstName(),user1.getLastName(),user1.getCurrentAge());
        System.out.printf("Your current maximum heart rate is %.2fbeats per minute and your target heart rate is %.2fbeats per minutes%n"
                ,user1.maximumHeartRate(),user1.targetHeartRate());

    }
}
