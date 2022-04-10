package OverlappingRectangles;

import java.util.ArrayList;

public class RectangleList {
    private ArrayList<Rectangle> list;

    // Constructs an empty ArrayList
    public RectangleList() {
        this.list = new ArrayList<Rectangle>();
    }

    // Creates a new window from Rectangle
    public void addElement(Rectangle window) {
        list.add(window);
    }

    // Moves element to front from its Z position
    public void moveElement(Rectangle window) {
        list.add(0, window);
        list.remove(window.getZ() - 1);
    }

    // Moves rectangle if it is clicked
    public void ifClicked(Rectangle r, int x, int y) {
        if (r.isClicked(x, y)) {
            moveElement(r);
        }
    }
}
