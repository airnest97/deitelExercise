package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiceGameCrapTest {

    public DiceGame game;
    @BeforeEach
    public void setUp(){
        game = new DiceGame();
    }

    @Test
    public void sevenIsAWinTest(){
        game.rollDice(2, 5);
        assertEquals("Yay!!!! You Win", game.getStatus());
    }

    @Test
    public void elevenIsAWinTest(){
        game.rollDice(5,6);
        assertEquals("Yay!!!! You Win", game.getStatus());
    }

    @Test
    public void twoIsALoseTest(){
        game.rollDice(1, 1);
        assertEquals("Oh crap!! You Lose", game.getStatus());
    }

    @Test
    public void threeIsALoseTest(){
        game.rollDice(2, 1);
        assertEquals("Oh crap!! You Lose", game.getStatus());
    }

    @Test
    public void twelveIaALoseTest(){
        game.rollDice(6, 6);
        assertEquals("Oh crap!! You Lose", game.getStatus());
    }

    @Test
    public void continuousRoll(){
        game.rollDice(2, 2);
        assertEquals("You get another turn, Please try again", game.getStatus());
    }

    @Test
    public void initialPointWinsTest(){
        game.rollDice(2, 2);
        game.initialPointWins(2, 2);
        assertEquals("Yay!!!! You Win", game.getStatus());
    }

    @Test
    public void sevenAfterMultipleRollsIsAWin(){
        game.rollDice(2, 2);
        assertEquals(4, game.getPoint());
        game.rollDice(4, 3);
        assertEquals("Yay!!!! You Win", game.getStatus());
    }
}
