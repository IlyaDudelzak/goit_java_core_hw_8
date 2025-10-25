public class Romb extends Parallelogram {

    public Romb() {
        this(4, Math.PI / 3, Point.getZero());
    }

    public Romb(double side, double angle) {
        this(side, angle, Point.getZero());
    }

    public Romb(double side, double angle, Point position) {
        super(side, side, angle, position);
    }

    public double getSide() {
        return sideA;
    }

    public void setSide(double side) {
        super.setSideA(side);
        super.setSideB(side);
    }

    @Override
    public double getArea() {
        return sideA * sideA * Math.sin(angle);
    }

    @Override
    public double getPerimiter() {
        return sideA * 4;
    }

    @Override
    public void printName() {
        System.out.println("Romb");
    }

    @Override
    public void printInfo() {
        System.out.println("Romb with \nPosition:\n\tx: " + position.getX() + "\n\ty: " + position.getY() + "\nSide: " + sideA + "\nAngle: " + this.getAngleDegrees() + " degrees\nArea: " + this.getArea() + "\nPerimiter: " + this.getPerimiter());
    }
}