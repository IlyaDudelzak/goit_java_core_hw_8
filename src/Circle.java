public class Circle extends Shape {
    protected double r;

    public Circle() {
        this(5, Point.getZero());
    }

    public Circle(double r) {
        this(r, Point.getZero());
    }

    public Circle(double r, Point position) {
        super(position);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public double getPerimiter() {
        return 2 * Math.PI * r;
    }

    @Override
    public void printName() {
        System.out.println("Circle");
    }

    @Override
    public void printInfo() {
        System.out.println("Circle with \nPosition:\n\tx: " + position.getX() + "\n\ty: " + position.getY() + "\nRadius: " + r + "\nArea: " + this.getArea() + "\nPerimiter: " + this.getPerimiter() + '\n');
    }
}