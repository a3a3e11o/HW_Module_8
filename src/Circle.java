public class Circle extends Shape {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (double) radius * (double) radius;
    }
    @Override
    public String getName() {
        return "Circle";
    }
}