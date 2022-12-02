import java.util.Scanner;
import java.util.Locale;

public class CanadaPostStampRates {
    public static void main(String[] args) {
        // FIXME: ADD INTERNATIONAL AND AMERICAN SHIPPING OPTIONS, AND INCLUDE
        // NON-STANDARD CANADIAN
        // WEBSITE:
        // https://www.canadapost-postescanada.ca/cpc/en/personal/sending/letters-mail/postage-rates.page
        Scanner scnr = new Scanner(System.in);
        // Canada Post 2022 - Weight in grams, cost in cents

        // STANDARD SIZE MAIL DESTINATION CANADA
        double[] sLttrWghtCan = { 30, 50 }, sPstgCstCan = { 1.07, 1.30 };
        // NON STANDARD SIZE MAIL DESTINATION CANADA
        double[] nsLttrWghtCan = { 100, 200, 300, 400, 500 }, nsPstgCstCan = { 1.94, 3.19, 4.44, 5.09, 5.49 };

        double userLetterWeight;
        boolean foundWeight;
        int i;

        // Prompt user to enter letter weight
        System.out.print("Enter letter weight (in grams): ");
        userLetterWeight = scnr.nextDouble();

        // Postage costs is based on smallest letter weight greater than
        // or equal to mailing letter weight
        foundWeight = false;

        for (i = 0; (i < sLttrWghtCan.length) && (!foundWeight); ++i) {
            if (userLetterWeight <= sLttrWghtCan[i]) {
                foundWeight = true;
                System.out.printf(Locale.US, "Postage for Canada Post standard mail is $%,.2f", sPstgCstCan[i]);
            }
        }

        if (!foundWeight) {
            System.out.println("Letter is too heavy for Canada Post standard mail with destination Canada.");
        }
    }
}
