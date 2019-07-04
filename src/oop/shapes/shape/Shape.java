package oop.shapes.shape;

import javax.naming.OperationNotSupportedException;

public class Shape {

    protected double parA = 0;
    protected double parB = 0;

    public Shape(double parA, double parB) {
        setParams(parA, parB);
    }

    public void setParams(double parA, double b) {
        this.parA = parA;
        parB = b;
    }

    public void setParB(double parB) throws OperationNotSupportedException {
        this.parB = parB;
    }

    public double calculateSurface() {
        return -100;
    }

    public String toString() {
        return getClass().getSimpleName() + "[" + parA + ", " + parB +
                "],surf:" + calculateSurface();
    }
}
