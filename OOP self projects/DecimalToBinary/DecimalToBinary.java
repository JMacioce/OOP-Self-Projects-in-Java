import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int userDecimal;
        String binary;

        System.out.print("Enter a decimal number: ");
        userDecimal = s.nextInt();

        binary = Integer.toBinaryString(userDecimal);

        System.out.println("Binary representation of" + userDecimal + " is " + binary);
    }
}
