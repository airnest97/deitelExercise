package chapterNineProject;

public class Animal extends LivingThings{

    public Animal(){
        System.out.println("I am creating animal");
    }

    @Override
    public void move(){
        super.move();
        System.out.println("Move like animal");
    }

    public void yourFathersMove(){
        super.move();
    }
}
