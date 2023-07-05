public class Main {
    public static void main(String[] args) {

        Quad quad = new Quad();
        quad.setSide(5);

        Circle circle = new Circle();
        circle.setRadius(1);

        Rectangle rectangle = new Rectangle();
        rectangle.setSide(10,2);

        Triangle triangle = new Triangle();
        triangle.setSide(10,6);

        Parallelogram parallelogram = new Parallelogram();
        parallelogram.setSide(20,5);

        NamePrinter namePrinter = new NamePrinter();
        AreaPrinter areaPrinter = new AreaPrinter();

        namePrinter.printName(quad); //Figure name is Quad
        areaPrinter.printArea(quad); //Square of Quad is 25.0

        namePrinter.printName(circle); //Figure name is Circle
        areaPrinter.printArea(circle); //Square of Circle is 3.141592653589793

        namePrinter.printName(rectangle); //Figure name is Rectangle
        areaPrinter.printArea(rectangle); //Square of Rectangle is 20.0

        namePrinter.printName(triangle); //Figure name is Triangle
        areaPrinter.printArea(triangle); //Square of Triangle is 30.0

        namePrinter.printName(parallelogram); //Figure name is Parallelogram
        areaPrinter.printArea(parallelogram); //Square of Parallelogram is 100.0

    }
}