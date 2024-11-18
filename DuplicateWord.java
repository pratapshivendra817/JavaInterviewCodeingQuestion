import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWord {
    
    public static void main(String[] args) {
        String input = "this is a test this is only a test";

        Map<String, Long> duplicates = Arrays.stream(input.split("\\s+"))
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() > 1)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        duplicates.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
