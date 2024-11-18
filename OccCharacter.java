
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccCharacter {
    
    public static void main(String[] args) {
        String input = "example String";

        Map<Character, Long> charOcc = input.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charOcc.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
