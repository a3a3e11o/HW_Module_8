public class Rectangle extends Shape {
    private int side1;
    private int side2;
    public void setSide(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    @Override
    public double getArea() {
        return side1 * side2;
    }
    @Override
    public String getName() {
        return "Rectangle";
    }
}
