package chapter6;

public class ParkingCharges {
    static double totalCharges = 0;
    static double charges = 0;
    public static void main(String[] args) {
        calculateCharges(13);
        calculateCharges(6);
        calculateCharges(3);
        calculateCharges(24);
        displayTotalCharges();
    }

    public static void calculateCharges(int parkingHours){
        if (parkingHours > 0 && parkingHours <= 3){charges = 2; }
        else if (parkingHours > 3 && parkingHours <= 19){charges = 2 + ((parkingHours-3)/2.0);}
        else if (parkingHours > 19 && parkingHours <= 24){charges = 10;}
        System.out.println("Your charges is "+charges+" dollars");
        totalCharges += charges;

    }
    public static void displayTotalCharges(){
        System.out.println("The total charges so far is "+totalCharges+" dollars");
    }

}
