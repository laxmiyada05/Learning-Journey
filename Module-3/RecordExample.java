import java.util.*;
import java.util.stream.Collectors;
record Person(String name, int age) {}
public class RecordExample {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Alice", 30),
            new Person("Bob", 17),
            new Person("Charlie", 25)
        );
        System.out.println("All people:");
        people.forEach(System.out::println);
        System.out.println("\nAdults (age >= 18):");
        people.stream()
              .filter(p -> p.age() >= 18)
              .forEach(System.out::println);
    }
}
