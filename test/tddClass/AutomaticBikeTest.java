package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {

    private AutoBike bike;
    @BeforeEach
    public void setup(){
        bike = new AutoBike();
    }

    @Test
    public void turnOnBikeTest() {
        bike.turnOn();
        assertTrue(bike.getPowerStatusIsOn());
    }

    @Test
    public void turnOffBikeTest() {
        bike.turnOff();
        assertFalse(bike.getPowerStatusIsOn());
    }

    @Test
    public void accelerationTest1() {
        int speed = 0;
        while(speed < 20){
            bike.increaseSpeed();
            speed = speed + 1;
        }
        assertEquals(20, bike.getSpeed());
    }

    @Test
    public void accelerationTest2() {
        int speed = 0;
        while (speed < 21){
            bike.increaseSpeed();
            speed = speed + 1;
        }
        assertEquals(21, bike.getSpeed());

        for(int i = 0; i < 4; i++){
            bike.increaseSpeed();
        }
        assertEquals(29, bike.getSpeed());
    }

    @Test
    public void accelerationTest3() {
        int speed = 0;
        while(speed <= 20){
            bike.increaseSpeed();
            speed = speed + 1;
        }
        assertEquals(21, bike.getSpeed());

        for(int i =0; i < 5; i++){
            bike.increaseSpeed();
        }
        assertEquals(31, bike.getSpeed());

        for(int i = 0; i < 4; i++){
            bike.increaseSpeed();
        }
        assertEquals(43, bike.getSpeed());
    }

    @Test
    public void accelerationTest4() {
        for(int i = 0; i <= 20; i++){
            bike.increaseSpeed();
        }
        assertEquals(21, bike.getSpeed());

        int speed =0;
        while(speed < 5){
            bike.increaseSpeed();
            speed = speed + 1;
        }
        assertEquals(31, bike.getSpeed());

        int i = 0;
        while(i < 4){
            bike.increaseSpeed();
            i = i + 1;
        }
        assertEquals(43, bike.getSpeed());

        for(int j = 0; j <3; j++){
            bike.increaseSpeed();
        }
        assertEquals(55, bike.getSpeed());
    }

    @Test
    public void deccelerationTest1() {
        for(int i = 0; i <= 20; i++){
            bike.increaseSpeed();
        }
        assertEquals(21, bike.getSpeed());

        bike.increaseSpeed();
        bike.increaseSpeed();
        assertEquals(25, bike.getSpeed());

        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        assertEquals(19, bike.getSpeed());

        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        assertEquals(13, bike.getSpeed());
    }

    @Test
    public void deccelerationTest2() {
        int i = 0;
        while(i <= 20){
            bike.increaseSpeed();
            i++;
        }
        assertEquals(21, bike.getSpeed());

        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        assertEquals(31, bike.getSpeed());

        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        assertEquals(43, bike.getSpeed());

        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        assertEquals(28, bike.getSpeed());

        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        assertEquals(20, bike.getSpeed());

        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        assertEquals(17, bike.getSpeed());
    }

    @Test
    public void deccelerationTest3() {
        for(int i = 0; i <= 20; i++){
            bike.increaseSpeed();
        }
        assertEquals(21, bike.getSpeed());

        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        assertEquals(31, bike.getSpeed());

        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        assertEquals(43, bike.getSpeed());

        bike.increaseSpeed();
        bike.increaseSpeed();
        assertEquals(51, bike.getSpeed());

        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        assertEquals(39, bike.getSpeed());

        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        assertEquals(30, bike.getSpeed());

        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        assertEquals(20, bike.getSpeed());

        bike.decreaseSpeed();
        assertEquals(19, bike.getSpeed());
    }

    @Test
    public void deccelerationTest4() {
        for(int i = 0; i <= 20; i++){
            bike.increaseSpeed();
        }
        assertEquals(21, bike.getSpeed());

        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        assertEquals(31, bike.getSpeed());

        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        assertEquals(43, bike.getSpeed());

        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        assertEquals(55, bike.getSpeed());

        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        assertEquals(39, bike.getSpeed());

        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        assertEquals(30, bike.getSpeed());

        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        assertEquals(20, bike.getSpeed());

        for(int i = 0; i < 14; i++){
            bike.decreaseSpeed();
        }
        assertEquals(6, bike.getSpeed());
    }

    @Test
    public void gearRangeTest1(){
        bike.gearState(16);
        assertEquals("Gear 1", bike.getGearType());
    }

    @Test
    public void gearRangeTest2(){
        bike.gearState(25);
        assertEquals("Gear 2", bike.getGearType());
    }

    @Test
    public void gearRangeTest3(){
        bike.gearState(38);
        assertEquals("Gear 3", bike.getGearType());
    }

    @Test
    public void gearRangeTest4(){
        bike.gearState(48);
        assertEquals("Gear 4", bike.getGearType());
    }
}
