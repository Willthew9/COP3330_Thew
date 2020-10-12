public class Pyramid extends Shape3D {

    //constructor
    public Pyramid(double length, double width, double height) {
        l = length;
        w = width;
        h = height;
    }

    //calculates and returns volume of pyramid
    @Override
    public double getVolume() {
        double V;

        V = (l*w*h)/3;

        return V;
    }

    //returns name of pyramid
    @Override
    public String getName() {
        return ("pyramid");
    }

    //calculates and returns surface area of pyramid
    @Override
    public Double getArea() {
        double A, p1, p2, p3, p4, p5, p6, p7, p8;

        p1=w/2;
        p2=Math.pow(p1,2) + Math.pow(h,2);
        p3=Math.sqrt(p2);
        p4=l*p3;
        p5=l/2;
        p6=Math.pow(p5,2) + Math.pow(h,2);
        p7=Math.sqrt(p6);
        p8=w*p7;
        A=(l*w) + p4 + p8;

        return A;
    }

    //initialization
    double l = 0.0;
    double w = 0.0;
    double h = 0.0;
}
