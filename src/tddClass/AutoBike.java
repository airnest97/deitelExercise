package tddClass;

public class AutoBike {

    private boolean isOn;
    private int speed;
    private String gearType;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean getPowerStatusIsOn() {
        return isOn;
    }

    public int getSpeed() {
       return speed;
    }

    public void increaseSpeed() {
        if(speed >= 0 && speed <= 20)
           speed = speed + 1;
        else if(speed >= 21 && speed <=30)
            speed = speed + 2;
        else if(speed >= 31 && speed <=40)
            speed = speed + 3;
        else if(speed > 41)
            speed = speed + 4;
    }

    public void decreaseSpeed() {
        if(speed >= 0 && speed <= 20){
            speed = speed - 1;
        }
        if(speed >= 21 && speed <=30) {
            speed = speed - 2;
        }
        if(speed >= 31 && speed <=40){
            speed = speed - 3;
        }
        else if(speed > 41)
            speed = speed - 4;{
        }
    }

    public void gearState(int speedometer) {
        if(speedometer >= 0) if(speedometer <= 20) {gearType = "Gear 1";}
        if(speedometer > 20) if(speedometer <= 30) {gearType = "Gear 2";}
        if(speedometer > 30) if(speedometer <= 40) {gearType = "Gear 3";}
        if(speedometer > 40) {gearType = "Gear 4";}
    }

    public String getGearType() {
       return gearType;
    }
}
