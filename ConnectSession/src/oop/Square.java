package oop;

public class Square extends Shape {
    public Square(Double sideLength){
        super(sideLength,sideLength, 0.0);
    }

    @Override
    public String getName(){
        return Square.class.getSimpleName();
    }

    @Override
    public Double calculateArea() {
        return this.getLength() * this.getWidth();
    }

    @Override
    public Double calculatePerimeter() {
        return this.getWidth()*4;
    }
}
