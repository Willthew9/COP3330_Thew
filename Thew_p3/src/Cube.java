public class Cube extends Shape3D {

    //constructor
    public Cube(double l) {
        length = l;
    }

    //calculates and returns volume of cube
    @Override
    public double getVolume() {
        double V;

        V = Math.pow(length, 3);

        return V;
    }

    //returns name of cube
    @Override
    public String getName() {
        return "cube";
    }

    //calculates and returns surface area of cube
    @Override
    public Double getArea() {
        double A;

        A = 6 * Math.pow(length, 2);

        return A;
    }

    //initialization
    double length = 0.0;
}
