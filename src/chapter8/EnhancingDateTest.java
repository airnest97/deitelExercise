package chapter8;

public class EnhancingDateTest {
    public static void main(String[] args) {

        EnhancingDate date = new EnhancingDate(22, 5, 1997);


        for (int i = 0; i < 20; i++) {
            date.nextDay();
        }
    }
}
