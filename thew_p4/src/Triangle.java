public class Triangle extends Shape2D {

    //constructor
    public Triangle(double b, double h) {
        base = b;
        height = h;
    }

    //returns name of triangle
    @Override
    public String getName() {
        return ("triangle");
    }

    //calculates and returns area of triangle
    @Override
    public Double getArea() {
        double A;

        A = (height * base) / 2;

        return A;
    }

    //initialization
    double base = 0.0;
    double height = 0.0;
}
