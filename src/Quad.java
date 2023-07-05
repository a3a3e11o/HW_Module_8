public class Quad extends Shape {
    private int side;
    public void setSide(int side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return side * side;
    }
    @Override
    public String getName() {
        return "Quad";
    }
}
