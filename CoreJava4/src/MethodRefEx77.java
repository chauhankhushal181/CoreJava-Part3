import java.util.Arrays;
import java.util.List;

public class MethodRefEx77 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin", "Harsh","jhon");
        List<String> uNames = names.stream()
                .map(String::toUpperCase)
                .toList();
        uNames.forEach(System.out::println);
    }
}
