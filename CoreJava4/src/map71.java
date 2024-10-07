import java.security.Key;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class map71 {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("n", 56);
        students.put("H", 16);
        students.put("f", 46);
        students.put("k", 16);
        students.put("p", 26);

//      System.out.println(students.keySet());

        for (String Key : students.keySet())
        {
            System.out.println(Key + " : "+ students.get(Key));
        }
    }
}
