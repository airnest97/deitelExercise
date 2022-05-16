package classwork.chapterNineProject;

public class Vertebrate extends Animal {

    public Vertebrate(){
        System.out.println("I am creating vertebrate");
    }

    public void move(){
        super.move();
        System.out.println("Vertebrate dey move");
    }
}
