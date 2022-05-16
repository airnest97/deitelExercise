package classwork.designPatterns;

public class Main {
    public static void main(String[] args) {
        Pray pray = new Pray();
        Move move = new Move();
        PapaNosa nosa = new PapaNosa(move, pray);

        nosa.pray();

        Pray pray2 = new Pray2();
        nosa.setPray(pray2);

        nosa.pray();

        Pray pray1 = new Pray1();
        nosa.setPray(pray1);

        nosa.pray();
    }
}

