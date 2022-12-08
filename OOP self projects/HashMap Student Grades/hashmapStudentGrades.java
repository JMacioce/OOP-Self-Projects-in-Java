import java.util.Scanner;
import java.util.HashMap;

public class hashmapStudentGrades {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String studentName, input;
        double studentGrade;

        HashMap<String, Double> studentGrades = new HashMap<String, Double>();

        // Students's grades (pre-entered)
        studentGrades.put("Bhupinder Singh", 78.4);
        studentGrades.put("Michael Fann", 81.0);
        studentGrades.put("David Fann", 78.6);
        studentGrades.put("Chrissy Elliot", 75.4);
        studentGrades.put("Cindy Lou Who", 98.2);

        System.out.println("Original List:");
        studentGrades.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + "'s grade is: " + entry.getValue());
        });
        System.out.println();
        // TODO: Read in new grade for a student, output initial
        // grade, replace with new grade in HashMap,
        // output new grade
        // while (true) {
        System.out.println("Would you like to add or update the list? (input \"yes\" to update)");
        input = scnr.nextLine();
        if (input.equals("yes") || input.equals("YES") || input.equals("\"yes\"")) {
            System.out.println("Input full name: ");
            studentName = scnr.nextLine();
            System.out.println("Input grade: ");
            studentGrade = scnr.nextDouble();
            if (studentGrades.containsKey(studentName)) {
                System.out.println(studentName + "'s original grade: " + studentGrades.get(studentName) + "\n");
            }
            studentGrades.put(studentName, studentGrade);
            System.out.println(studentName + "'s new grade: " + studentGrades.get(studentName) + "\n");
        } else {
            // break;
        }
        // }

        System.out.println("Final Grades:");
        studentGrades.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + "'s grade is: " + entry.getValue());
        });

        scnr.close();
    }
}