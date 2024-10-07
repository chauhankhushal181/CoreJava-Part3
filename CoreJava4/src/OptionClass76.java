import java.util.Arrays;
import java.util.List;

public class OptionClass76 {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("Navin","Lakshmi","john","Shortish","xerox");
        String name = names.stream()
                .filter(str -> str.contains("x"))
                .findFirst()
                .orElse("Not Found");

        System.out.println(name);
    }
}
