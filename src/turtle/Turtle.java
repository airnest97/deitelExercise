package turtle;

import static turtle.Direction.*;

public class Turtle {
    private final Pen pen = new Pen();
    private Direction currentDirection = EAST;
    private final Position currentPosition = new Position(0, 0);

    public boolean isPenDown() {
        return pen.isDown();
    }

    public void penDown() {
        pen.penDown();
    }

    public void penUp() {
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

    public void move(int noOfSteps, SketchPad sketchPad) {
        if (isPenDown()) {
            moveAndWrite(noOfSteps, sketchPad);
        }
        moveWithoutWriting(noOfSteps);
    }

    private void moveAndWrite(int noOfSteps, SketchPad sketchPad) {
        switch (currentDirection) {
            case EAST -> writeOnColumn(noOfSteps, sketchPad);
            case SOUTH -> writeOnRow(noOfSteps, sketchPad);
            case WEST -> writeBackwardOnColumn(noOfSteps, sketchPad);
            case NORTH -> writeBackwardOnRow(noOfSteps, sketchPad);
        }
    }

    private void writeBackwardOnRow(int noOfSteps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        if ((currentPosition.getRow() + noOfSteps > floor.length)) {
            int row = currentPosition.getRow();
            int column = currentPosition.getColumn();
            noOfSteps = noOfSteps - row;
            for (int i = noOfSteps - 1; i < row; i++) {
                floor[i][column] = 1;
            }
        }
        else
            throw new TurtleFloorOutOfBoundException("Turtle has fallen off the cliff");
    }

    private void writeBackwardOnColumn(int noOfSteps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        if ((currentPosition.getColumn() + noOfSteps > floor.length)) {
            int row = currentPosition.getRow();
            int column = currentPosition.getColumn();
            noOfSteps = noOfSteps - column;
            for (int i = noOfSteps - 1; i < column; i++) {
                floor[row][i] = 1;
            }
        }
        else
            throw new TurtleFloorOutOfBoundException("Turtle has fallen off the cliff");
    }

    private void writeOnRow(int noOfSteps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        if (!(currentPosition.getRow() + noOfSteps > floor.length)) {
            int row = currentPosition.getRow();
            int column = currentPosition.getColumn();
            noOfSteps = noOfSteps + row;
            for (int i = row; i < noOfSteps; i++) {
                floor[i][column] = 1;
            }
        }
        else
            throw new TurtleFloorOutOfBoundException("Turtle has fallen off the cliff");
    }

    private void writeOnColumn(int noOfSteps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        if (!(currentPosition.getColumn() + noOfSteps > floor.length)) {
            int row = currentPosition.getRow();
            int column = currentPosition.getColumn();
            noOfSteps = noOfSteps + column;
            for (int i = column; i < noOfSteps; i++) {
                floor[row][i] = 1;
            }
        }
        else
            throw new TurtleFloorOutOfBoundException("Turtle has fallen off the cliff");

    }

    private void moveWithoutWriting(int noOfSteps) {
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
}
