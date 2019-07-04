package oop.shapes.shape;

public class Triangle extends Shape {
// wiekszosc zmian polega na uwzglednieniu parametru C
    private double parC;

    public Triangle(double parA, double parB, double parC) {
        super(parA, parB);
        this.parC = parC;
    }


    //s(s-a)(s-b)(s-c)   - wzór na pole trójkąta gdy znamy 3 ścianki


    @Override
    public double calculateSurface() {
        if((parA+parB)>parC && (parA+parC)>parB && (parB+parC)>parA)
        {
            // obliczenie wysokosci
            double s=(parA+parB+parC)/2;
            double  area=Math.sqrt(s*(s-parA)*(s-parB)*(s-parC));
           // System.out.println("Area of Triangle is: " + area);
            return area;
        }
        else
           // System.out.println("Area of Triangle not exit");
        return -1;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "parA=" + parA +
                ", parB=" + parB +
                ", parC=" + parC +
                '}';
    }

    public Triangle setParC(double parC) {
        this.parC = parC;
        return this;
    }
}
