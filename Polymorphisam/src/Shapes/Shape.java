package Shapes;

public abstract class Shape {
    private Double perimeter;
    private Double area;

    public abstract void calculatePerimeter();
    public abstract void calculateArea();

    public void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimeter() {
        return this.perimeter;
    }

    public Double getArea() {
        return this.area;
    }
}
