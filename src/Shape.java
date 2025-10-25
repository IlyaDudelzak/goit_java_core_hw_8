public abstract class Shape implements ShapeInterface {
    protected Point position;

    public Shape() {
        this(Point.getZero());
    }

    public Shape(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimiter() {
        return 0;
    }

    @Override
    public void printName() {
        System.out.println("Shape");
    }

    @Override
    public void printInfo() {
        System.out.println("Shape with \nPosition:\n\tx: " + position.getX() + "\n\ty: " + position.getY() + "\nArea: " + this.getArea() + "\nPerimiter: " + this.getPerimiter());
    }
}