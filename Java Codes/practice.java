import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class practice {
public static void main(String[] args) {
    
    List<String> names = Arrays.asList("Raj", "Anita", "Ravi");

List<String> sortedUpper = names.stream()
                                .map(String::toUpperCase)  // Transform
                                .sorted()                  // Sort
                                .collect(Collectors.toList()); // Collect result

            System.out.println(sortedUpper);
}

}