package ticTacToeImplementationTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import chapter6.ticTacToeImplementation.Cell;
import chapter6.ticTacToeImplementation.Player;
import chapter6.ticTacToeImplementation.TicTacToe;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    TicTacToe ticTacToe;
    @BeforeEach
    public void setUp() {
        ticTacToe = new TicTacToe(Cell.EMPTY);
    }
    @Test
    public void testThatTicTactToeClassExist(){
        assertNotNull(ticTacToe);
    }

    @Test
    public void testThatCellHasEnumValueEmpty() {
        Cell cell = Cell.EMPTY;
        assertNotNull(cell);
    }

    @Test
    public void testThatCellHasEnumValueX() {
        Cell cell = Cell.X;
        assertNotNull(cell);
    }

    @Test
    public void testThatCellHasEnumValueO() {
        Cell cell = Cell.O;
        assertNotNull(cell);
    }

    @Test
    public void testThatTicTactToeHasEmptyValueBoardElementAtCreation(){
        Cell[][] expected = {{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY}, {Cell.EMPTY, Cell.EMPTY, Cell.EMPTY}, {Cell.EMPTY, Cell.EMPTY, Cell.EMPTY}};
        assertArrayEquals(expected, ticTacToe.getArray());
    }

    @Test
    public void testThatPlayersTwoExist(){
        assertEquals(2, ticTacToe.getPlayers().length);
    }

    //    ??
    @Test
    public void testThatPlayersHaveIdAndCanBeGotten() {
        Player player1 = new Player(1);
        assertNotNull(player1);
        player1.setId(1);
        assertEquals(1, player1.getId());
    }

    @Test
    public void testThatPlayerOneCanMChooseACellO(){
        //Given that i have a player
        Player one = ticTacToe.getPlayers()[0];
        //When he chooses a cell
        one.setXorO(Cell.O);
        //assert that the cell he chooses is O
        Cell cell = one.getXorO();
        assertEquals(Cell.O, cell);
    }

    @Test
    public void testThatPlayerOneCanMChooseACellX(){
        //Given that i have a player
        Player one = ticTacToe.getPlayers()[0];
        //When he chooses a cell
        one.setXorO(Cell.X);
        //assert that the cell he chooses is O
        Cell cell = one.getXorO();
        assertEquals(Cell.X, cell);
    }

    @Test
    public void testThatPlayerOneCanMakeAMove(){
        //Given that i have a player
        Player one = ticTacToe.getPlayers()[0];
        //player sets is choice of cell to O
        one.setXorO(Cell.X);
        //assert that the cell he chooses is O
        Cell cell = one.getXorO();
        //when i mark on the board
        ticTacToe.markBoard(0, 0, cell);
        //check that cell is marked
        Cell[][] expected = {{Cell.X, Cell.EMPTY, Cell.EMPTY}, {Cell.EMPTY, Cell.EMPTY, Cell.EMPTY}, {Cell.EMPTY, Cell.EMPTY, Cell.EMPTY}};
        assertArrayEquals(expected, ticTacToe.getArray());
    }

    @Test
    public void testThatPlayerTwoCanMakeAMove(){
        //Given that i have a player
        Player two = ticTacToe.getPlayers()[1];
        //player sets is choice of cell to O
        two.setXorO(Cell.O);
        //assert that the cell he chooses is O
        Cell cell = two.getXorO();
        //when i mark on the board
        ticTacToe.markBoard(1, 0, cell);
        //check that cell is marked
        Cell[][] expected = {{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY}, {Cell.O, Cell.EMPTY, Cell.EMPTY}, {Cell.EMPTY, Cell.EMPTY, Cell.EMPTY}};
        assertArrayEquals(expected, ticTacToe.getArray());
    }

    @Test
    public void testThatPlayerOneAndPlayerTwoCanMakeMoves(){
        //Given that i have 2 player
        Player one = ticTacToe.getPlayers()[0];
        Player two = ticTacToe.getPlayers()[1];
        //player sets is choice of cell to O
        one.setXorO(Cell.X);
        two.setXorO(Cell.O);
        //assert that the cell he chooses is O
        Cell cell1 = one.getXorO();
        Cell cell2 = two.getXorO();
        //when i mark on the board
        ticTacToe.markBoard(0, 0, cell1);
        ticTacToe.markBoard(1, 0, cell2);
        //check that cell is marked
        Cell[][] expected = {{Cell.X, Cell.EMPTY, Cell.EMPTY}, {Cell.O, Cell.EMPTY, Cell.EMPTY}, {Cell.EMPTY, Cell.EMPTY, Cell.EMPTY}};
        assertArrayEquals(expected, ticTacToe.getArray());
    }

//    @Test
//    public void testThatCellsAlreadyMarkedCantBeMarkedAgain(){
//        //Given that i have 2 player
//        Player one = ticTacToe.getPlayers()[0];
//        Player two = ticTacToe.getPlayers()[1];
//        //player sets is choice of cell to O
//        one.setXorO(Cell.X);
//        two.setXorO(Cell.O);
//        //assert that the cell he chooses is O
//        Cell cell1 = one.getXorO();
//        Cell cell2 = two.getXorO();
//        //when i mark on the board
//        ticTacToe.markBoard(0, 0, cell1);
//        ticTacToe.markBoard(0, 0, cell2);
//        //check that cell is marked
//        Cell[][] expected = {{Cell.X, Cell.EMPTY, Cell.EMPTY}, {Cell.EMPTY, Cell.EMPTY, Cell.EMPTY}, {Cell.EMPTY, Cell.EMPTY, Cell.EMPTY}};
//        assertArrayEquals(expected, ticTacToe.getArray());
//    }

    @Test
    public void testThatWHenPlayerPlaysOnAlreadyMARKEDCell_ExceptionCanBeThrown(){
        Player one = ticTacToe.getPlayers()[0];
        Player two = ticTacToe.getPlayers()[1];
        Cell cell1 =ticTacToe.takeTurns(one, two);
        ticTacToe.markBoard(0,0,cell1);
        Cell cell2 =ticTacToe.takeTurns(one, two);
        assertEquals(2, ticTacToe.getPlayerTurn());
        assertThrows(IllegalArgumentException.class, ()->ticTacToe.markBoard(0, 0, cell2));
    }

    @Test
    public void testThatPlayerTwoCanTakeTurnsAndHasCell_O(){
        //Given that i have a game, i have 2 players
        Player one = ticTacToe.getPlayers()[0];
        Player two = ticTacToe.getPlayers()[1];
        ticTacToe.takeTurns(one, two);
//        when the player who just played is player 1
        assertEquals(1, one.getId());
        assertEquals(1, ticTacToe.getPlayerTurn());
//        assertThatTheNextPlayerIsPlayer 2 and cell to play is an O
        Cell cell = ticTacToe.takeTurns(one, two);
        assertEquals(Cell.O, cell);
    }

    @Test
    public void testThatPlayerOneCanTakeTurnsAndHasCell_X(){
        //Given that i have a game, i have 2 players
        Player one = ticTacToe.getPlayers()[0];
        Player two = ticTacToe.getPlayers()[1];
        Cell cell1 =ticTacToe.takeTurns(one, two);
        assertEquals(1, ticTacToe.getPlayerTurn());
        assertEquals(Cell.X, cell1);
    }



//    @Test
//    public void testThatWhenItsNotPlayerOneOrTwoHasCell_EMPTY(){
//        //Given that i have a game, i have 2 players
//        Player one = ticTacToe.getPlayers()[0];
//        Player two = ticTacToe.getPlayers()[1];
//        Cell cell1 =ticTacToe.takeTurns(one, two);
//        assertEquals(3, ticTacToe.getPlayerTurn());
//        assertEquals(Cell.EMPTY, cell1);
//    }

    @Test
    public void testThatWinsCanBeComputedForRow1(){
        //Given that i have 2 player
        Player one = ticTacToe.getPlayers()[0];
        Player two = ticTacToe.getPlayers()[1];
        //player sets is choice of cell to O
        Cell cell1 =ticTacToe.takeTurns(one, two);

        //assert that the cell he chooses is O
        //when i mark on the board
        ticTacToe.markBoard(0, 0, cell1);
        ticTacToe.markBoard(0, 1, cell1);
        ticTacToe.markBoard(0, 2, cell1);
        //check that cell is marked
        Cell[][] expected = {{Cell.X, Cell.X, Cell.X}, {Cell.EMPTY, Cell.EMPTY, Cell.EMPTY}, {Cell.EMPTY, Cell.EMPTY, Cell.EMPTY}};
        assertArrayEquals(expected, ticTacToe.getArray());

        int playerId = ticTacToe.checkWin(cell1);
        assertEquals(1, playerId);
    }

    @Test
    public void testThatWinsCanBeComputedForColumn2(){
        //Given that i have 2 player
        Player one = ticTacToe.getPlayers()[0];
        Player two = ticTacToe.getPlayers()[1];
        //player sets is choice of cell to O
        one.setXorO(Cell.X);
        two.setXorO(Cell.O);
        //assert that the cell he chooses is O
        Cell cell1 =ticTacToe.takeTurns(one, two);
        //when i mark on the board
        ticTacToe.markBoard(0, 1, cell1);
        ticTacToe.markBoard(1, 1, cell1);
        ticTacToe.markBoard(2, 1, cell1);
        //check that cell is marked
        Cell[][] expected = {{Cell.EMPTY, Cell.X, Cell.EMPTY}, {Cell.EMPTY, Cell.X, Cell.EMPTY}, {Cell.EMPTY, Cell.X, Cell.EMPTY}};
        assertArrayEquals(expected, ticTacToe.getArray());

        int playerId = ticTacToe.checkWin(cell1);
        assertEquals(1, playerId);
    }

    @Test
    public void testThatWinsCanBeComputedForColumn3(){
        //Given that i have 2 player
        Player one = ticTacToe.getPlayers()[0];
        Player two = ticTacToe.getPlayers()[1];
        //player sets is choice of cell to O
        one.setXorO(Cell.X);
        two.setXorO(Cell.O);
        Cell cell1 =ticTacToe.takeTurns(one, two);
        //assert that the cell he chooses is O
        //when i mark on the board
        ticTacToe.markBoard(0, 2, cell1);
        ticTacToe.markBoard(1, 2, cell1);
        ticTacToe.markBoard(2, 2, cell1);
        //check that cell is marked
        Cell[][] expected = {{Cell.EMPTY, Cell.EMPTY, Cell.X}, {Cell.EMPTY, Cell.EMPTY, Cell.X}, {Cell.EMPTY, Cell.EMPTY, Cell.X}};
        assertArrayEquals(expected, ticTacToe.getArray());

        int playerId = ticTacToe.checkWin(cell1);
        assertEquals(1, playerId);
    }
    //wins for rows
    @Test
    public void testThatWinsCanBeComputedForColumn1(){
        //Given that i have 2 player
        Player one = ticTacToe.getPlayers()[0];
        Player two = ticTacToe.getPlayers()[1];
        //player sets is choice of cell to O
        //assert that the cell he chooses is O
        Cell cell1 =ticTacToe.takeTurns(one, two);

        //when i mark on the board
        ticTacToe.markBoard(0, 0, cell1);
        ticTacToe.markBoard(1, 0, cell1);
        ticTacToe.markBoard(2, 0, cell1);
        //check that cell is marked
        Cell[][] expected = {{Cell.X, Cell.EMPTY, Cell.EMPTY}, {Cell.X, Cell.EMPTY, Cell.EMPTY}, {Cell.X, Cell.EMPTY, Cell.EMPTY}};
        assertArrayEquals(expected, ticTacToe.getArray());

        int playerId = ticTacToe.checkWin(cell1);
        assertEquals(1, playerId);
    }

    @Test
    public void testThatWinsCanBeComputedForRow2(){
        //Given that i have 2 player
        Player one = ticTacToe.getPlayers()[0];
        Player two = ticTacToe.getPlayers()[1];
        //player sets is choice of cell to O
        Cell cell1 =ticTacToe.takeTurns(one, two);
        //assert that the cell he chooses is O
        //when i mark on the board
        ticTacToe.markBoard(1, 0, cell1);
        ticTacToe.markBoard(1, 1, cell1);
        ticTacToe.markBoard(1, 2, cell1);
        //check that cell is marked
        Cell[][] expected = {{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY}, {Cell.X, Cell.X, Cell.X}, {Cell.EMPTY, Cell.EMPTY, Cell.EMPTY}};
        assertArrayEquals(expected, ticTacToe.getArray());

        int playerId = ticTacToe.checkWin(cell1);
        assertEquals(1, playerId);
    }

    @Test
    public void testThatWinsCanBeComputedForRow3(){
        //Given that i have 2 player
        Player one = ticTacToe.getPlayers()[0];
        Player two = ticTacToe.getPlayers()[1];
        //player sets is choice of cell to O
        //assert that the cell he chooses is O
        Cell cell1 =ticTacToe.takeTurns(one, two);

        //when i mark on the board
        ticTacToe.markBoard(2, 0, cell1);
        ticTacToe.markBoard(2, 1, cell1);
        ticTacToe.markBoard(2, 2, cell1);
        //check that cell is marked
        Cell[][] expected = {{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY}, {Cell.EMPTY, Cell.EMPTY, Cell.EMPTY}, {Cell.X, Cell.X, Cell.X}};
        assertArrayEquals(expected, ticTacToe.getArray());

        int playerId = ticTacToe.checkWin(cell1);
        assertEquals(1, playerId);
    }

    @Test
    public void testThatWinsCanBeComputedForDiagonal2(){
        //Given that i have 2 player
        Player one = ticTacToe.getPlayers()[0];
        Player two = ticTacToe.getPlayers()[1];
        //player sets is choice of cell to O
        //assert that the cell he chooses is O
        Cell cell1 =ticTacToe.takeTurns(one, two);

        //when i mark on the board
        ticTacToe.markBoard(0, 2, cell1);
        ticTacToe.markBoard(1, 1, cell1);
        ticTacToe.markBoard(2, 0, cell1);
        //check that cell is marked
        Cell[][] expected = {{Cell.EMPTY, Cell.EMPTY, Cell.X}, {Cell.EMPTY, Cell.X, Cell.EMPTY}, {Cell.X, Cell.EMPTY, Cell.EMPTY}};
        assertArrayEquals(expected, ticTacToe.getArray());

        int playerId = ticTacToe.checkWin(cell1);
        assertEquals(1, playerId);
    }

    @Test
    public void testThatWinsCanBeComputedForDiagonal1(){
        //Given that i have 2 player
        Player one = ticTacToe.getPlayers()[0];
        Player two = ticTacToe.getPlayers()[1];
        //player sets is choice of cell to O
        //assert that the cell he chooses is O
        Cell cell1 =ticTacToe.takeTurns(one, two);

        //when i mark on the board
        ticTacToe.markBoard(0, 0, cell1);
        ticTacToe.markBoard(1, 1, cell1);
        ticTacToe.markBoard(2, 2, cell1);
        //check that cell is marked
        Cell[][] expected = {{Cell.X, Cell.EMPTY, Cell.EMPTY}, {Cell.EMPTY, Cell.X, Cell.EMPTY}, {Cell.EMPTY, Cell.EMPTY, Cell.X}};
        assertArrayEquals(expected, ticTacToe.getArray());

        int playerId = ticTacToe.checkWin(cell1);
        assertEquals(1, playerId);
    }
}
