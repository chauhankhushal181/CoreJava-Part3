import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class student {
    private String name;
    private int age;
    public student(){

    }
    public student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class ConstructorRefEx78 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin", "Harsh","jhon");
        List<student> students = new ArrayList<>();
        students = names.stream()
                .map(student::new)
                .toList();

        System.out.println(students);
    }
}
