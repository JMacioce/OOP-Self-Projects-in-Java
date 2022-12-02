import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean needInput = true;
        double interestRate = 0, initialSavings = 0;
        int years = 0;

        while (needInput) {
            System.out.print("Enter initial savings: ");
            try {
                initialSavings = s.nextDouble();
                needInput = false;
            } catch (InputMismatchException e) {
                s.nextLine();
            }
        }
        needInput = true;

        while (needInput) {
            System.out.print("Enter interest rate (ex. 8.2% = 8.2): ");
            try {
                interestRate = (s.nextDouble() / 100);
                needInput = false;
            } catch (InputMismatchException e) {
                s.nextLine();
            }
        }
        needInput = true;

        while (needInput) {
            System.out.print("Enter years of interest to accrue: ");
            try {
                years = s.nextInt();
                needInput = false;
            } catch (InputMismatchException e) {
                s.nextLine();
            }
        }

        System.out.println("\nAnnual savings for " + years + " years: \n");

        double currSavings = initialSavings, growthTotal = 0, yearlyGrowth = 0;

        for (int i = 0; i < years + 1; i++) {

            if (i == 0) {
                System.out.printf(Locale.US, "Starting amount is $%,.2f\n", currSavings);
            } else if (i > 0) {
                System.out.printf(Locale.US,
                        "Year: %d at %.2f%%   $%,.2f\nTotal gain: $%,.2f   Yearly gain: $%,.2f\n\n", i,
                        interestRate * 100, currSavings, growthTotal, yearlyGrowth);
            }
            yearlyGrowth = currSavings * interestRate;
            growthTotal += (currSavings + (currSavings * interestRate)) - currSavings;
            currSavings += (currSavings * interestRate);
        }
    }
}