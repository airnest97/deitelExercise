package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcTest {

    @Test
    public void noArgTest(){
        Ac ac = new Ac();
        assertEquals(16, ac.getTemperature());
    }
}
