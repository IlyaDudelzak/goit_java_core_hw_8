public class Parallelogram extends Shape {
    protected double sideA, sideB, angle;

    public Parallelogram() {
        this(6, 4, Math.PI / 3, Point.getZero());
    }

    public Parallelogram(double sideA, double sideB, double angle) {
        this(sideA, sideB, angle, Point.getZero());
    }

    public Parallelogram(double sideA, double sideB, double angle, Point position) {
        super(position);
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
    }

    public double getAngleRadians() {
        return angle;
    }

    public void setAngleRadians(double angle) {
        this.angle = angle;
    }

    public double getAngleDegrees() {
        return Math.toDegrees(angle);
    }

    public void setAngleDegrees(double angle) {
        this.angle = Math.toRadians(angle);
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB * Math.sin(angle);
    }

    @Override
    public double getPerimiter() {
        return 2 * sideA + 2 * sideB;
    }

    @Override
    public void printName() {
        System.out.println("Parallelogram");
    }

    @Override
    public void printInfo() {
        System.out.println("Parallelogram with \nPosition:\n\tx: " + position.getX() + "\n\ty: " + position.getY() + "\nSides:\n\tA: " + sideA + "\n\tB: " + sideB + "\nAngle: " + this.getAngleDegrees() + " degrees\nArea: " + this.getArea() + "\nPerimiter: " + this.getPerimiter());
    }
}