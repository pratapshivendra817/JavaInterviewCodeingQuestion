import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {

    public static void main(String[] args) {
        String sentence = "Hello World";

        String result = Arrays.stream(sentence.split("\\s+"))
            .map(word -> new StringBuilder(word).reverse().toString())
            .collect(Collectors.joining(" "));

        System.out.println("Reversed words: " + result);
    }
}
