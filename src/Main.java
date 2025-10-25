//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Shape[] shapes = {
            new Circle(3d),
            new Parallelogram(10d, 5d, Math.PI / 3d, new Point(10, 25)),
            new Rectangle(20d, 15d, new Point(50, -25)),
            new Square(5d, new Point(-50, 25)),
            new Romb(3.5d, Math.PI / 3d)
    };
    for(Shape shape: shapes){
        NamePrinter.printShapeInfo(shape);
        System.out.println("");
    }
}
