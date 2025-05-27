import java.util.ArrayList;
import java.util.Scanner;
public class StudentList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        String name;
        System.out.println("Enter student names (type 'exit' to stop):");
        while (true) {
            name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            students.add(name);
        }
        System.out.println("Student Names:");
        for (String student : students) {
            System.out.println(student);
        }
        scanner.close();
    }
}
