package oop.shapes.shape;

public class Rectangle extends Shape {

    public Rectangle(double parA, double parB) {
        super(parA, parB);
    }

    public double calculateSurface() {
        return parA * parB;
    }

}
