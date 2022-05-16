package chapter8;

public class Time2 {
    private int seconds;
    private int minutes;
    private int hours;

    public Time2(int seconds) {
        if (seconds > 59) {
            minutes = seconds / 60;
            this.seconds = seconds % 60;
            if (minutes > 59){
                hours = minutes / 60;
                minutes = minutes % 60;
            }
        }
        else {
            this.seconds = seconds;
        }
        if (seconds < 0){
            throw new IllegalArgumentException();
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d %s",
                (getHours() == 0 || getHours() == 12) ? 12 : getHours() % 12,
                getMinutes(), getSeconds(), (getHours() < 12) ? "AM" : "PM");
    }
}
