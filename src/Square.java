public class Square extends Rectangle {

    public Square() {
        this(4, Point.getZero());
    }

    public Square(double side) {
        this(side, Point.getZero());
    }

    public Square(double side, Point position) {
        super(side, side, position);
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
        return sideA * sideA;
    }

    @Override
    public double getPerimiter() {
        return sideA * 4;
    }

    @Override
    public void printName() {
        System.out.println("Square");
    }

    @Override
    public void printInfo() {
        System.out.println("Square with \nPosition:\n\tx: " + position.getX() + "\n\ty: " + position.getY() + "\nSide: " + sideA + "\nArea: " + this.getArea() + "\nPerimiter: " + this.getPerimiter());
    }
}