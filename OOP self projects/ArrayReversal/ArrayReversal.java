import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i; // Loop index
        int tempVal; // Temp variable for swapping
        // FIX ME: ADD INPUT EXCEPTION AND NEGATIVE/ZERO VALUE EXCEPTION

        System.out.print("Enter a number for array size: ");
        int x = scnr.nextInt();
        int[] userVals = new int[x];

        // Prompt user to input values
        System.out.println("\nEnter " + x + " integer values");
        for (i = 0; i < userVals.length; ++i) {
            System.out.print("Value " + (i + 1) + ": ");
            userVals[i] = scnr.nextInt();
        }

        // Reverse array's elements
        for (i = 0; i < (userVals.length / 2); ++i) {
            tempVal = userVals[i]; // Temp for swap
            userVals[i] = userVals[userVals.length - 1 - i]; // First part of swap
            userVals[userVals.length - 1 - i] = tempVal; // Swap complete
        }

        // Print numbers
        System.out.print("\nValues Reversed: ");
        for (i = 0; i < userVals.length; ++i) {
            System.out.print(userVals[i] + " ");
        }
    }
}