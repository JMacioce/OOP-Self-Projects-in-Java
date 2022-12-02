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
                if (initialSavings <= 0) {
                    throw new Exception("(Inital Savings must be greater than 0)\n");
                }
                needInput = false;
            } catch (InputMismatchException e) {
                System.out.println("(Please input a number!)\n");
                s.nextLine();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                s.nextLine();
            }
        }
        needInput = true;

        while (needInput) {
            System.out.print("Enter interest rate (ex. 8.2% = 8.2): ");
            try {
                interestRate = (s.nextDouble() / 100);
                if (interestRate <= 0) {
                    throw new Exception("(Interest Rate must be greater than 0)\n");
                }
                needInput = false;
            } catch (InputMismatchException e) {
                System.out.println("(Please input a number!)\n");
                s.nextLine();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                s.nextLine();
            }
        }
        needInput = true;

        while (needInput) {
            System.out.print("Enter years of interest: ");
            try {
                years = s.nextInt();
                if (years <= 0) {
                    throw new Exception("(Years must be greater than 0)\n");
                }
                needInput = false;
            } catch (InputMismatchException e) {
                System.out.println("(Please input a whole number!)\n");
                s.nextLine();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
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