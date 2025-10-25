public class Rectangle extends Parallelogram {

    public Rectangle() {
        this(6, 4, Point.getZero());
    }
    public Rectangle(double sideA, double sideB) {
        this(6, 4, Point.getZero());;
    }
    public Rectangle(double sideA, double sideB, Point position) {
        super(sideA, sideB, Math.PI / 2, position);
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void printName() {
        System.out.println("Rectangle");
    }

    @Override
    public void printInfo() {
        System.out.println("Rectangle with \nPosition:\n\tx: " + position.getX() + "\n\ty: " + position.getY() + "\nSides:\n\tA: " + sideA + "\n\tB: " + sideB + "\nArea: " + this.getArea() + "\nPerimiter: " + this.getPerimiter());
    }
}