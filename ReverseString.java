public class ReverseString {
    
    public static void main(String[] args) {
        String input = "Hello World";

        String reverseString = input.chars()

        .mapToObj(c->String.valueOf((char)c))

        .reduce(" ", (a,b) -> b+a);

       System.out.println("ReverseString:" + reverseString);
    }
}
