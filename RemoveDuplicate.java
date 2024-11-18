import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args) {
        
        String input = "hello world hello copilot hello world";

        String result = Arrays.stream(input.split("\\s+"))
            .distinct()
            .collect(Collectors.joining(" "));

        System.out.println("Result without duplicates: " + result);
    }
}
