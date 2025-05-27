import java.util.*;
public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Eve", "Bob");
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted list:");
        names.forEach(System.out::println);
    }
}
