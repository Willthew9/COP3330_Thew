public class Square extends Shape2D {

   //constructor
    public Square(double w) {
        width = w;
    }

    //returns name of square
    @Override
    public String getName() {
        return "square";
    }

    //calculates and returns area of square
    @Override
    public Double getArea() {
        double A;

        A = Math.pow(width, 2);

        return A;
    }

    //initialization
    double width = 0.0;
}
