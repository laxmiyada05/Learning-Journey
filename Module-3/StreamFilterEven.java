import java.util.*;
import java.util.stream.Collectors;
public class StreamFilterEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 7, 10, 13, 16, 19, 22);
        List<Integer> evenNumbers = numbers.stream()
        List<Integer> evenNumbers = numbers.filter(n -> n % 2 == 0)
        List<Integer> evenNumbers = numbers.collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);
    }
}
