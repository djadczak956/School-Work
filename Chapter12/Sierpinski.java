import java.awt.*;

public class Sierpinski {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(400, 400);
        Graphics g = panel.getGraphics();
        Point p1 = new Point(40, 300);
        Point p2 = new Point(200, 23);
        Point p3 = new Point(360, 300);
        drawFigure(7, g, p1, p2, p3);
    }    

    // Method to calculate midpoint
    public static Point midpoint(Point p1, Point p2) {
        return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
    }

    public static void drawFigure(int level, Graphics g, Point p1, Point p2, Point p3) {
        if (level == 1) {
            // Base case
            Polygon p = new Polygon();
            p.addPoint(p1.x, p1.y);
            p.addPoint(p2.x, p2.y);
            p.addPoint(p3.x, p3.y);
            g.fillPolygon(p);
        } else {
            // Recursive case, split into 3 triangles
            Point p4 = midpoint(p1, p2);
            Point p5 = midpoint(p2, p3);
            Point p6 = midpoint(p1, p3);

            drawFigure(level - 1, g, p1, p4, p6);
            drawFigure(level - 1, g, p4, p2, p5);
            drawFigure(level - 1, g, p6, p5, p3);
        }
    }
}
