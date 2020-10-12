public class Sphere extends Shape3D {

    //constructor
    public Sphere(double radius) {
        r = radius;
    }

    //calculates and returns volume of sphere
    @Override
    public double getVolume() {
        double V, p1, p2, p3;

        V = ((4.0)/(3.0)) * 3.14159 * Math.pow(r, 3);

        return V;
    }

    //returns name of sphere
    @Override
    public String getName() {
        return "sphere";
    }

    //calculates and returns surface area of sphere
    @Override
    public Double getArea() {
        double A;

        A = 4 * 3.14159 * Math.pow(r, 2);

        return A;
    }

    //initialization
    double r = 0.0;
}
