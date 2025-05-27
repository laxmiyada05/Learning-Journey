import java.util.Scanner;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            if (age < 18) {
                throw new InvalidAgeException("You must be at least 18 years old.");
            }
            System.out.println("Access granted.");
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        scanner.close();
    }
}
