import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Occurrences {

    public static void main(String[] args) {
        String input = "this is a test string with some words this is a test.";

       
        Map<String, Long> occurrences = Stream.of(input.split("\\s+"))
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    
        occurrences.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
