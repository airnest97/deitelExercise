package tddClass;

public class AirCondition {

    private int temperature = 16;
    private boolean powerStatus;

    public void turnON(boolean status) {
        powerStatus = status;
    }

    public boolean getPowerStatus() {
        return powerStatus;
    }

    public void turnOff(boolean status) {
        powerStatus = status;
    }

    public void setTemperature(int initTemperature) {
        if(initTemperature >= 16) if(initTemperature <= 30)
            temperature = initTemperature;
        if (initTemperature < 16)
            temperature = 16;
        if (initTemperature > 30)
            temperature = 30;

    }

    public void increaseTemperature() {if(temperature >= 16) if(temperature <= 30)
        temperature = temperature + 1;
        if(temperature > 30)
            temperature = 30;

    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {if(temperature >= 16) if(temperature <= 30)
            temperature = temperature - 1;
        if(temperature < 16)
            temperature = 16;
    }
}
