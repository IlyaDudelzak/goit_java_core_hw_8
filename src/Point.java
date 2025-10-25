public class Point {
    private final double x, y;
    private static final Point zero = new Point(0, 0);

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(double x) {
        this(x, 0);
    }

    public Point() {
        this(0, 0);
    }

    public static Point getZero() {
        return zero;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "Point at x: " + x + ", y: " + y;
    }
}