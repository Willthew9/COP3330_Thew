public class Circle extends Shape2D {

    //constructor
    public Circle(double r) {
        radius = r;
    }

    //returns name of circle
    @Override
    public String getName() {
        return "circle";
    }

    //calculates and returns area of circle
    @Override
    public Double getArea() {
        double A;

        A = 3.1415 * Math.pow(radius, 2);

        return A;
    }

    //initialization
    double radius = 0.0;
}
