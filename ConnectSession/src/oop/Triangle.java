package oop;

public class Triangle extends Shape {

    final Double base;
    public Triangle(Double base, Double sideA, Double sideB, Double height) {
        super(sideA, sideB, height);
        this.base = base;
    }

    @Override
    public String getName() {
        return Triangle.class.getSimpleName();
    }

    @Override
    public Double calculateArea() {
        return 0.5 * base * getHeight();
    }

    @Override
    public Double calculatePerimeter() {
        return getLength() + getWidth() + base;
    }
}
