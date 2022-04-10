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

    // Checks if randomly clicked point is in a rectangle
    public boolean isClicked(int x, int y) {
        Point p = new Point(x, y);
        if (p.clicked()) {
            if ((p.getX() >= x && p.getX() <= x + length) && (p.getY() >= y && p.getY() <= y + width)) {
                return true;    // Return true if the clicked point is in the Rectangle
            }
        }
        return false;
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
