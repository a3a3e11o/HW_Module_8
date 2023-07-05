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

        NamePrinter.printName(quad); //Figure name is Quad
        AreaPrinter.printArea(quad); //Square of Quad is 25.0

        NamePrinter.printName(circle); //Figure name is Circle
        AreaPrinter.printArea(circle); //Square of Circle is 3.141592653589793

        NamePrinter.printName(rectangle); //Figure name is Rectangle
        AreaPrinter.printArea(rectangle); //Square of Rectangle is 20.0

        NamePrinter.printName(triangle); //Figure name is Triangle
        AreaPrinter.printArea(triangle); //Square of Triangle is 30.0

        NamePrinter.printName(parallelogram); //Figure name is Parallelogram
        AreaPrinter.printArea(parallelogram); //Square of Parallelogram is 100.0

    }
}