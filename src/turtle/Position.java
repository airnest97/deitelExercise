package turtle;

public class Position {
    private int row;
    private int column;
    
    public Position(int row, int column) {
        this.row = row;
        this. column = column;
    }

    @Override
    public boolean equals(Object o){
        if (o.getClass() != this.getClass())return false;
        Position compared = (Position) o;
        return compared.column == this.column && compared.row == this.row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getColumn() {
        return column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    @Override
    public String toString(){
        return String.format("""
                row = %d
                column = %d
                """, row, column);
    }
}
