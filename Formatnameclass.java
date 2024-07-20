import java.util.Scanner;

public class formatName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name in FIRST.MIDDLE.LAST format: ");
        String name = scanner.next();

        String[] parts = name.split("\\.");
        String firstName = parts[0];
        String middleName = parts[1];
        String lastName = parts[2];

        String formattedName = lastName + ", " + firstName + " " + middleName.charAt(0) + ".";
        System.out.println("Formatted Name: " + formattedName);
    }
}
