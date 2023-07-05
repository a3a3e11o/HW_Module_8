public class Triangle extends Shape {
    private int side;
    private int high;
    public void setSide(int side, int high) {
        this.side = side;
        this.high = high;
    }
    @Override
    public double getArea() {
        return 0.5 * side * high;
    }
    @Override
    public String getName() {
        return "Triangle";
    }
}
