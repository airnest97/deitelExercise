package chapter6.ticTacToeImplementation;

public class Player {
    public Cell xorO;
    private int id;

    public Player(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setXorO(Cell cell) {
        xorO = cell;
    }

    public Cell getXorO() {
        return xorO;
    }
}
