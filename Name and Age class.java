import java.util.Scanner;
import java.time.Year;

public class NameAndAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = scanner.next();
        System.out.print("Enter year of birth: ");
        int yearOfBirth = scanner.nextInt();

        int currentYear = Year.now().getValue();
        int age = currentYear - yearOfBirth;
        int nameLength = firstName.length();

        System.out.println("There are " + nameLength + " characters in " + firstName + "'s name.");
        System.out.println(firstName + " will be " + age + " years old in " + currentYear + ".");
    }
}
