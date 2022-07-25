package dependencyInjection;

public class Animal {
    private Movement movement;

    public Animal(Movement move) {
        this.movement = move;
    }

    public Animal(){

    }

    public void setMove(Movement move) {
        this.movement = move;
    }
    public void move(){
     movement.move();
    }
}
