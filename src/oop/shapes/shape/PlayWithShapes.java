package oop.shapes.shape;

public class PlayWithShapes {
    public static void main(String[] args) {
        Shape circle = new Circle(1.3);

        Shape triangle = new Triangle(3.6,3.1,3);
        double area = triangle.calculateSurface();
        double area2 = circle.calculateSurface();
        System.out.printf("Circle: %.2f\n" +
                "Triangle: %.2f\n", area2, area);
    }
}
