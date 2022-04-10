package OverlappingRectangles;

public class Point {
    private int x;
    private int y;

    // Parameterless constructor that makes (0, 0)
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor that makes (x, y)
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Accessor for x
    public int getX() {
        return x;
    }

    // Accessor for y
    public int getY() {
        return y;
    }

    // Randomly generates if a point has been clicked
    public boolean clicked() {
        int num = (int) (Math.random() * 2);
        if (num == 0) {
            return false;
        }
        return true;
    }
}
