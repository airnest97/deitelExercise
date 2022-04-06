package chapter3;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;
    private int currentYear;

    public HeartRates(String firstName, String lastName,
                      int yearOfBirth, int monthOfBirth, int dayOfBirth,
                      int currentYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (yearOfBirth > 0)
            this.yearOfBirth = yearOfBirth;
        if (monthOfBirth > 0 && monthOfBirth < 12) {
            this.monthOfBirth = monthOfBirth;
        }
        if (dayOfBirth > 0 && dayOfBirth < 31) {
            this.dayOfBirth = dayOfBirth;}
        if (currentYear > 0){
            this.currentYear = currentYear;}
    }
    public void setFirstName(String firstName){this.firstName = firstName;}
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){this.lastName = lastName;}
    public String getLastName(){
        return lastName;
    }

    public void setYearOfBirth(int yearOfBirth){this.yearOfBirth= yearOfBirth;}
    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth){this.monthOfBirth= monthOfBirth;}
    public int getMonthOfBirth(){
        return monthOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth){this.dayOfBirth= dayOfBirth;}
    public int getDayOfBirth(){
        return dayOfBirth;
    }

    public void setCurrentYear(int currentYear){this.currentYear= currentYear;}
    public int getCurrentYear(){
        return currentYear;
    }
    public int getCurrentAge(){
        return currentYear - yearOfBirth;
    }

    public double maximumHeartRate(){
        return 220 -(currentYear - yearOfBirth);
    }

    public double targetHeartRate(){
        return 0.68 * (220 - (currentYear - yearOfBirth)); //using 68% rate
    }
}
