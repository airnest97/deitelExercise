package chapter3;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;
    private double height;
    private double weight;
    private int currentYear;
    private String bmiStatus;


    public HealthProfile(String firstName, String lastName, String gender,
                         int yearOfBirth, int monthOfBirth, int dayOfBirth, double height, double weight,
                         int currentYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        if (yearOfBirth > 0)
            this.yearOfBirth = yearOfBirth;
        if (monthOfBirth > 0 && monthOfBirth < 12) {
            this.monthOfBirth = monthOfBirth;
        }
        if (dayOfBirth > 0 && dayOfBirth < 31) {
            this.dayOfBirth = dayOfBirth;
        }
        if (height > 0) {
            this.height = height;
        }
        if (weight > 0) {
            this.weight = weight;
        }
        if (currentYear > 0) {
            this.currentYear = currentYear;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public int getCurrentAge() {
        return currentYear - yearOfBirth;
    }

    public double maximumHeartRate() {
        return 220 - (currentYear - yearOfBirth);
    }

    public double targetHeartRate() {
        return 0.68 * (220 - (currentYear - yearOfBirth)); //using 68% rate
    }

    public double getBMI() {
        return (weight * 703.0) / (height * height);
    }

    public void setBmiStatus() {
        if ((weight * 703.0) / (height * height) < 18.5){
            bmiStatus = "UnderWeight";} if
        ((((weight * 703.0) / (height * height)) >= 18.5) && (((weight * 703.0) / (height * height)) <= 24.9)){
                bmiStatus = "Normal Weight";}
        if ((((weight * 703.0) / (height * height)) >= 25) && (((weight * 703.0) / (height * height)) <= 29.9)){
            bmiStatus = "Over Weight";}
        if (((weight * 703.0) / (height * height)) >= 30){
            bmiStatus = "Over Weight";}
    }
    public String getBmiStatus(){
        return bmiStatus;
    }
}
