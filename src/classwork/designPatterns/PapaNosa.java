package classwork.designPatterns;

public class PapaNosa {
    private Move move;
    private Pray pray;

    public PapaNosa(Move move, Pray pray){
        this.move = move;
        this.pray = pray;
    }

    public void setPray(Pray pray){
        this.pray = pray;
    }
    public void pray(){
        pray.pray();
    }

    public void Move(){
        move.move();
    }


}
