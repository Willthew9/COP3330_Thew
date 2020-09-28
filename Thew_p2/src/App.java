import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
public class App {

    //collects user entered heights
    private static double getUserHeight(){
        double height = 0;
        Scanner scanner = new Scanner(System.in);

        //checks that user height is a valid number
        while(height<=0) {
            System.out.println("Please enter valid height in inches: ");
            height = scanner.nextDouble();
        }
    return(height);
    }

    //collects user entered weights
    private static double getUserWeight(){
        double weight = 0;
        Scanner scanner = new Scanner(System.in);

        //checks that user weight is a valid number
        while(weight<=0){
            System.out.println("Please enter valid weight in pounds: ");
            weight = scanner.nextDouble();
        }
    return(weight);
    }

    //asks user if the want to enter more data
    private static boolean moreInput(){
        String Y = "y";
        String N = "n";
        Scanner scanner = new Scanner(System.in);
        System.out.println("More Data? (Y or N): ");
        String ans = scanner.nextLine();

        //makes lower case entries submittable
        ans = ans.toLowerCase();

        //checks that user input is valid
        while(!ans.equals(Y) && !ans.equals(N)){
            System.out.println("Please enter valid response: ");
            ans = scanner.nextLine();
        }

        //checks if value was y
        if (ans.equals(Y)) {
            return(true);
        }

        //returns false otherwise
        return false;
    }

    //displays bmi category and score
    private static void  displayBmiInfo(BodyMassIndex bmi){
        System.out.println("Your BMI is: "+(bmi.bmicalc()));
        System.out.println("Your BMI category is: "+(bmi.bmicat()));
    }

    //displays score and category as well as the average bmi score
    private static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData){
        double sum = 0.0;
        double avg = 0.0;

        //cycles through array list and prints out bmi info
        for(int i=0; i<bmiData.size(); i++){
            System.out.println("Person " +(i+1));
            sum += bmiData.get(i).bmicalc();

            displayBmiInfo(bmiData.get(i));
        }

        //calculates and displays average bmi score
        avg = sum / bmiData.size();
        avg = Math.round(avg * 10) / 10.0;
        System.out.println("The average BMI is: " +avg);
    }

    public static void main(String[] args){
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()){
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }
        displayBmiStatistics(bmiData);
    }
}
