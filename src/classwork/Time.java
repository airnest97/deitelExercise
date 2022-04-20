package classwork;

public class Time {
    private int hour;
    private int minute;
    private int seconds;

    public void setTime(int hour, int minute, int seconds){
        boolean hourIsInvalid = hour < 0 || hour >= 24;
        if (hourIsInvalid) throw new IllegalArgumentException("Invalid hour");

        boolean minutesIsInvalid = minute < 0 || minute >= 60;
        if (minutesIsInvalid) throw new IllegalArgumentException("Invalid minute");

        boolean secondsIsInvalid = seconds < 0 || seconds >= 60;
        if (secondsIsInvalid)throw new IllegalArgumentException("Invalid seconds");


        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }
}
