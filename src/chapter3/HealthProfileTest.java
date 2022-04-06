package chapter3;

import java.util.Scanner;

public class HealthProfileTest { public static void main(String[] args){
    HealthProfile user1 = new HealthProfile("Adewale","Adeyinka","Male",
            1995,2,13,65,130,2022);
    System.out.printf("%s %s is %d years old. %n",user1.getFirstName(),user1.getLastName(),user1.getCurrentAge());
    System.out.printf("He is a %s with an height of %.2f and a weight of %.2f%n",user1.getGender(),user1.getHeight(),user1.getWeight());
    System.out.printf("He has a maximum heart rate of %.2fbeats per minute and a target heart rate of %.2fbeats per minutes%n"
            ,user1.maximumHeartRate(),user1.targetHeartRate());
    System.out.printf("His BMI is %.2f" ,user1.getBMI());
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

    System.out.printf("Enter your gender;%n");
    String gender = input.nextLine();
    user1.setGender(gender);

    System.out.printf("Enter your year of birth: ;%n");
    int birthYear = input.nextInt();
    user1.setYearOfBirth(birthYear);

    System.out.printf("Enter your month of birth: ;%n");
    int birthMonth = input.nextInt();
    user1.setMonthOfBirth(birthMonth);

    System.out.printf("Enter your day of birth: ;%n");
    int birthDay = input.nextInt();
    user1.setDayOfBirth(birthDay);

    System.out.printf("Enter your height: ;%n");
    double height = input.nextDouble();
    user1.setHeight(height);

    System.out.printf("Enter your weight: ;%n");
    double weight = input.nextDouble();
    user1.setWeight(weight);

    System.out.printf("Enter the current year you are in: ;%n");
    int currentYear = input.nextInt();
    user1.setCurrentYear(currentYear);
    user1.setBmiStatus();

    System.out.printf("Your name is %s %s and you are %d years old %n",user1.getFirstName(),user1.getLastName(),user1.getCurrentAge());
    System.out.printf("You are a %s with an height of %.2f and a weight of %.2f%n",user1.getGender(),user1.getHeight(),user1.getWeight());
    System.out.printf("Your current maximum heart rate is %.2fbeats per minute and your target heart rate is %.2fbeats per minutes%n"
            ,user1.maximumHeartRate(),user1.targetHeartRate());
    System.out.printf("Your BMI is %.2f and your BMI status is %s%n" ,user1.getBMI(), user1.getBmiStatus());

}
}
