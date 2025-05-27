import java.util.HashMap;
import java.util.Scanner;
public class StudentDirectory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> studentMap = new HashMap<>();
        System.out.println("Enter student ID and name (type '0' to stop):");
        while (true) {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline
            if (id == 0) break;
            System.out.print("Name: ");
            String name = scanner.nextLine();
            studentMap.put(id, name);
        }
        System.out.print("Enter ID to search for name: ");
        int searchId = scanner.nextInt();

        if (studentMap.containsKey(searchId)) {
            System.out.println("Student Name: " + studentMap.get(searchId));
        } else {
            System.out.println("ID not found.");
        }
        scanner.close();
    }
}
