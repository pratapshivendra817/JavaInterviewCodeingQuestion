import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String input = "programming";
        
        Map<Character, Long> duplicates = input.chars()               
            .mapToObj(c -> (char) c)                                 
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) 
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() > 1)                  
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));  

        System.out.println("Duplicate characters: " + duplicates);
    }
}
