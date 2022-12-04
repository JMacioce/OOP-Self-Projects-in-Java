import java.util.Scanner;

public class caloriesDiameterPie {

    public static double calcCircleArea(double circleDiameter) {
        double circleRadius;
        double circleArea;
        double piVal = 3.14159265;

        circleRadius = circleDiameter / 2.0;
        circleArea = piVal * circleRadius * circleRadius;

        return circleArea;
    }

    public static int getPizzaCalories(Scanner scnr) {
        double circleDiameter;
        int totalCalories;
        double caloriesPerSquareInch = 15.2; // calories in apple pie per square inch

        System.out.print("Enter a diameter of apple pie (inches): ");
        circleDiameter = scnr.nextDouble();
        totalCalories = (int) (calcCircleArea(circleDiameter) * caloriesPerSquareInch);
        return totalCalories;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("This apple pie will have " + getPizzaCalories(scnr) + " calories.\n");
        System.out.println("This apple pie will have " + getPizzaCalories(scnr) + " calories.");
    }
}
