import java.util.*;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter initial savings: ");
        double initialSavings = s.nextDouble();

        System.out.print("Enter interest rate (ex. 8.2% = 8.2): ");
        double interestRate = (s.nextDouble() / 100);

        System.out.print("Enter years of interest to accrue: ");
        int years = s.nextInt();

        System.out.println("\nAnnual savings for " + years + " years: ");

        double currSavings = initialSavings;

        for (int i = 0; i < years + 1; i++) {
            if (i > 0) {
                System.out.printf(Locale.US, "Year: %d   at %.2f%%   is $%,.2f\n", i, interestRate * 100, currSavings);
            } else if (i == 0) {
                System.out.printf(Locale.US, "Starting amount is $%,.2f\n", currSavings);
            }
            currSavings = currSavings + (currSavings * interestRate);
        }
    }
}