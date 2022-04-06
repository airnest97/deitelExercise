package chapter3;

public class ClockTest {
    public static void main(String[] args) {
        Clock clockTest1 = new Clock(23,11,55);
        Clock clockTest2 = new Clock(16,44,34);

        System.out.println(clockTest1.displayTime());
        System.out.println(clockTest2.displayTime());
    }
}
