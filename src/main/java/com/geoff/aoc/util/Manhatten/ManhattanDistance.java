package com.geoff.aoc.util.Manhatten;

public class ManhattanDistance {
    Direction direction;
    int x, y;

    public ManhattanDistance() {
        x = 0;
        y = 0;
        direction = Direction.NORTH;
    }

    public void turnRight() {
        switch (direction) {
            case NORTH:
                direction = Direction.EAST;
                break;
            case EAST:
                direction = Direction.SOUTH;
                break;
            case SOUTH:
                direction = Direction.WEST;
                break;
            case WEST:
                direction = Direction.NORTH;
                break;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case NORTH:
                direction = Direction.WEST;
                break;
            case EAST:
                direction = Direction.NORTH;
                break;
            case SOUTH:
                direction = Direction.EAST;
                break;
            case WEST:
                direction = Direction.SOUTH;
                break;
        }
    }

    public void moveForward(int spaces) {
        switch (direction) {
            case NORTH:
                y += spaces;
                break;
            case EAST:
                x += spaces;
                break;
            case SOUTH:
                y -= spaces;
                break;
            case WEST:
                x -= spaces;
                break;
        }
    }

    public int manhattanDistance(int x, int y) {
        return Math.abs(this.x - x) + Math.abs(this.y - y);
    }
}
