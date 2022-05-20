package turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtle.Direction.*;

public class TurtleTest {
    private Turtle turtle;

    @BeforeEach
    public void setUp() {
        turtle = new Turtle();
    }

    @Test
    void turtleExistsTest() {
        assertNotNull(turtle);
    }

    @Test
    void turtlePenIsUpByDefaultTest() {
        boolean isPenDown = turtle.isPenDown();
        assertFalse(isPenDown);
    }

    @Test
    void turtleCanMovePenDownTest() {
        turtle.penDown();
        boolean isPenDown = turtle.isPenDown();
        assertTrue(isPenDown);
    }

    @Test
    void turtleCanMovePenUpTest() {
        turtle.penDown();
        turtle.penUp();
        assertFalse(turtle.isPenDown());
    }

    @Test
    void turtleFacesEastByDefaultTest() {
        assertSame(EAST, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightFromEastTest() {
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightFromSouthTest() {
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightFromWestTest() {
        for (int i = 0; i < 3; i++) {
            turtle.turnRight();
        }
        assertSame(NORTH, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightFromNorthTest() {
        for (int i = 0; i < 4; i++) {
            turtle.turnRight();
        }
        assertSame(EAST, turtle.getCurrentDirection());
    }

    @DisplayName("When the turtle is facing east, turning left changes direction to north")

    @Test
    void turtleCanTurnLeftWhileFacingEastTest() {
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingNorthTest() {
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingWestTest() {
        for (int i = 0; i < 3; i++) {
            turtle.turnLeft();
        }
        assertSame(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingSouthTest() {
        for (int i = 0; i < 4; i++) {
            turtle.turnLeft();
        }
        assertSame(EAST, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanMoveForwardFacingEastTest() {
        turtle.move(5);
        assertEquals(new Position(0, 4), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanMoveForwardWhileFacingSouthTest() {
        turtle.move(5);
        turtle.turnRight();
        turtle.move(5);
        assertEquals(new Position(4, 4), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanMoveForwardWhileFacingWestTest() {
        turtle.move(5);
        turtle.turnRight();
        turtle.move(5);
        turtle.turnRight();
        turtle.move(5);
        assertEquals(new Position(4, 0), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanMoveForwardWhileFacingNorthTest() {
        turtle.move(5);
        turtle.turnRight();
        turtle.move(5);
        turtle.turnRight();
        turtle.move(5);
        turtle.turnRight();
        turtle.move(5);
        assertEquals(new Position(0, 0), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanMoveBackwardWhileFacingEastTest() {
        turtle.move(5);
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.move(5);
        assertEquals(new Position(0, 0), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanMoveBackwardWhileFacingSouthTest() {
        turtle.move(5);
        turtle.turnRight();
        turtle.move(5);
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.move(5);
        assertSame(NORTH, turtle.getCurrentDirection());
        assertEquals(new Position(0, 4), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanMoveBackwardWhileFacingWestTest() {
        turtle.move(5);
        turtle.turnRight();
        turtle.move(5);
        turtle.turnRight();
        turtle.move(5);
        turtle.turnRight();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.move(5);
        assertSame(EAST, turtle.getCurrentDirection());
        assertEquals(new Position(4, 4), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanMoveBackwardWhileFacingNorthTest() {
        turtle.move(5);
        turtle.turnRight();
        turtle.move(5);
        turtle.turnRight();
        turtle.move(5);
        turtle.turnRight();
        turtle.move(5);
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnLeft();
        turtle.move(5);
        turtle.turnLeft();
        turtle.move(5);
        assertSame(EAST, turtle.getCurrentDirection());
        assertEquals(new Position(4, 4), turtle.getCurrentPosition());
    }
}
