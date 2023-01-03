package oop;
// parent class
public class Shape implements IShape{

    private final Double length;
    private final Double width;
    private final Double height;
    public Shape(Double length, Double width, Double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getName(){
        return Shape.class.getCanonicalName();
    }

    @Override
    public Double calculateArea() {
        return length*width*height;
    }

    @Override
    public Double calculatePerimeter() {
        return length + width + height;
    }

    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }
}
