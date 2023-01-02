package oop;

public class ShapeMain {
    // The caller is your client
    public static void main(String[] args) {
       Shape triangle = new Triangle(10.0, 7.0, 7.0, 9.0);
       Shape square = new Square(5.0);


       Shape[] shapes = new Shape[]{
               triangle,
               square
       };

       for (Shape shape: shapes) {
           System.out.println("Shape: "+shape.getName());
           System.out.println("Area: " + shape.calculateArea());
           System.out.println("Perimeter: " + shape.calculatePerimeter());
       }
    }
}
