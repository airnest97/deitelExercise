package dependencyInjection;

public class Walk implements Movement{
    @Override
    public void move() {
        System.out.println("I can walk");
    }
}
