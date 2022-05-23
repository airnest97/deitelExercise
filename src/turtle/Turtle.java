package turtle;

import static turtle.Direction.*;

public class Turtle {
    private Pen pen = new Pen();
    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0, 0);
//    private Sketchpad sketchpad = new Sketchpad();


    public boolean isPenDown() {
        return pen.isDown();
    }

    public void penDown() {
        pen.penDown();
    }

    public void penUp(){
        pen.penUp();
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection == EAST) face(SOUTH);
        else if (currentDirection == SOUTH) face(WEST);
        else if (currentDirection == WEST) face(NORTH);
        else if (currentDirection == NORTH) face(EAST);
    }

    public void turnLeft() {
        switch (currentDirection) {
            case EAST -> face(NORTH);
            case NORTH -> face(WEST);
            case WEST -> face(SOUTH);
            case SOUTH -> face(EAST);
        }
    }

    private void face(Direction newDirection) {
        currentDirection = newDirection;
    }

    public void move(int noOfSteps) {
        if (currentDirection == EAST) increaseColumnBy(noOfSteps);
        else if (currentDirection == SOUTH) increaseRowBy(noOfSteps);
        else if (currentDirection == WEST) decreaseColumnBy(noOfSteps);
        else if (currentDirection == NORTH) decreaseRowBy(noOfSteps);
    }

    private void increaseColumnBy(int noOfSteps) {
        int currentColumnPosition = currentPosition.getColumn();
        currentPosition.setColumn(currentColumnPosition + noOfSteps - 1);
    }

    private void decreaseColumnBy(int noOfSteps) {
        int currentColumnPosition = currentPosition.getColumn();
        currentPosition.setColumn(currentColumnPosition - noOfSteps + 1);
    }

    private void increaseRowBy(int noOfSteps) {
        int currentRowPosition = currentPosition.getRow();
        currentPosition.setRow(currentRowPosition + noOfSteps - 1);
    }

    private void decreaseRowBy(int noOfSteps) {
        int currentRowPosition = currentPosition.getRow();
        currentPosition.setRow(currentRowPosition - noOfSteps + 1);
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

//    public void write(int row, int column, int noOfSteps) {
//        new Position(row, column);
//        move(noOfSteps);
//        for (int i = 0; i < noOfSteps; i++) {
//            sketchpad.getFloor() =
//        }
//    }

//    public String printSketchPad() {
//    }
}
