package chapter8;

public class EnhancedTime2Test {
    public static void main(String[] args) {



        EnhancedTime2 time = new EnhancedTime2(6000);
        time.tick();
        time.incrementMinute(120);
        System.out.println(time);

        EnhancedTime2 time1 = new EnhancedTime2(7000);
        time1.tick();
        time1.incrementHour(120);
        System.out.println(time1);
    }
}
