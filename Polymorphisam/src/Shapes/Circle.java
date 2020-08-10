package Shapes;

public class Circle extends Shape {
    private Double radius;

    public Circle(Double radius) {
        this.setRadius(radius);
    }

    private void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public final void calculatePerimeter() {
        super.setPerimeter(2 * Math.PI * radius);
    }

    public final Double getRadius() {
        return radius;
    }

    @Override
    public final void calculateArea() {
        super.setArea(Math.PI * radius * radius);
    }
}
