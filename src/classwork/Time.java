package classwork;

public class Time {
    private int hour;
    private int minute;
    private int seconds;

    public Time(int hour, int minute, int seconds) {
        validate(hour, minute, seconds);
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public Time() {
        this(0, 0, 0);
    }

    public Time(int seconds) {
     this(0, 0, 0);
    }

    public Time(int minute, int seconds) {
        this(0, 0, 0 );
    }

    public void setTime(int hour, int minute, int seconds) {
        validate(hour, minute, seconds);

        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        validateSeconds(seconds);
        this.seconds = seconds;
    }

    private static void validate(int hour, int minute, int seconds) {
        validateHour(hour);
        validateMinute(minute);
        validateSeconds(seconds);
    }

    private static void validateSeconds(int seconds) {
        boolean secondsIsInvalid = seconds < 0 || seconds >= 60;
        if (secondsIsInvalid)
            throw new IllegalArgumentException("Invalid seconds");
    }

    private static void validateMinute(int minute) {
        boolean minutesIsInvalid = minute < 0 || minute >= 60;
        if (minutesIsInvalid)
            throw new IllegalArgumentException("Invalid minute");
    }

    private static void validateHour(int hour) {
        boolean hourIsInvalid = hour < 0 || hour >= 24;
        if (hourIsInvalid)
            throw new IllegalArgumentException("Invalid hour");
    }
}
