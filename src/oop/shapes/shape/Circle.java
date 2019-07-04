package oop.shapes.shape;

import javax.naming.OperationNotSupportedException;

public class Circle extends Shape {
    //wiekszosc zmian polega na dostosowaniu do braku parametru B
    public Circle(double radius) {
        super(radius, 0);
    }

    // PI*r^2
    public double calculateSurface() {
        return Math.PI*(parA*parA);
    }

    public void setParB(double parB) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("There are no parameter B in case of circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + parA +
                '}';
    }
}
