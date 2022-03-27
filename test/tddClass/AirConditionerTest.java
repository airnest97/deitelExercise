package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AirConditionerTest {

    private AirCondition item;
    @BeforeEach
    public void setup(){
        item = new AirCondition();
    }

    @Test
    public void turnOnTest(){
        item.turnON(true);
        assertTrue(item.getPowerStatus());
    }

    @Test
    public void turnOffTest(){
        item.turnOff(false);
        assertFalse(item.getPowerStatus());
    }


    @Test
    public void increaseTemperatureTest(){
        item.setTemperature(16);
        for (int i = 0; i < 14; i++) {
            item.increaseTemperature();
        }
        assertEquals(30, item.getTemperature());
    }

    @Test
    public void decreaseTemperatureTest(){

        for(int i = 1; i <= 14; i++){
            item.decreaseTemperature();
        }
        assertEquals(16, item.getTemperature());
    }

    @Test
    public void increaseTemperatureBeyond30Test(){
        item.setTemperature(35);
        item.increaseTemperature();
        assertEquals(30, item.getTemperature());
    }

    @Test
    public void decreaseTemperatureBelow16Test(){
        item.setTemperature(10);
        item.decreaseTemperature();
        assertEquals(16, item.getTemperature());
    }
}
