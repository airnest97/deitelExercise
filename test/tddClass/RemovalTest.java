package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemovalTest {

    @Test
    void removal(){
        Remove remove = new Remove();
        String expected = remove.replace("java-is_tea");
        assertEquals("javaIsTea", expected);
    }

}
