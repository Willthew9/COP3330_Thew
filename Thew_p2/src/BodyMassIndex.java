import java.lang.Math;

public class BodyMassIndex{

    //constructor
    BodyMassIndex(double h, double w){
        height = h;
        weight = w;
    }

    //calculates bmi value
    public double bmicalc(){
        double bmi;
        int total = 0;
        double d = 0;

        bmi = 703 * weight / (Math.pow(height, 2));
        bmi = Math.round(bmi * 10) / 10.0;

    return(bmi);
    }

    //finds bmi category appropriate for bmi score
    public String bmicat(){
        String cat = "";
        double bmi = bmicalc();

        if(bmi<18.5){
            cat = "Underweight";
        }
        else if(bmi>=18.5 && bmi<24.9){
            cat = "Normal Weight";
        }
        else if(bmi>=25 && bmi<29.9){
            cat = "Overweight";
        }
        else if(bmi>30){
            cat = "Obese";
        }
        return cat;
    }
    double height = 0.0;
    double weight = 0.0;
}
