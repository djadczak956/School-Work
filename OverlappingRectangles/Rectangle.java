package OverlappingRectangles;

public class Rectangle {
    private int x;
    private int y;
    private int z;  // refers to whether the rectangle is on top or behind other (z-order)
    private int length;
    private int width;

    // Basic constructor
    public Rectangle(int x, int y, int length, int width) {
        this.x = x;
        this.y = y;
        this.length = length; 
        this.width = width;
    }

    // Accessor for x
    public int getX() {
        return x;
    }

    // Accessor for y
    public int getY() {
        return y;
    }

    // Accessor for z
    public int getZ() {
        return z;
    }

    // Accessor for length
    public int getLength() {
        return length;
    }

    // Accessor for width
    public int getWidth() {
        return width;
    }
}
