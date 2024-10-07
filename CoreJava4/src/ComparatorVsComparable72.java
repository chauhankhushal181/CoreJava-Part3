import java.util.*;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    public int compareTo(Student that) {
        if (this.age > that.age)
        return 1;
    else
        return -1;
    }
}

public class ComparatorVsComparable72 {
    public static void main(String[] args) {
        Comparator<Student> com = new Comparator<Student>() {

            public int compare(Student i, Student j) {
                if (i.age > j.age)
                    return 1;
                else
                return -1;
            }
        };

        List<Student> nums = new ArrayList<>();
        nums.add(new Student(21,"hi"));
        nums.add(new Student(43, "hello"));
        nums.add(new Student(33,"who"));
        nums.add(new Student(22,"my"));
        nums.add(new Student(43,"name"));

        Collections.sort(nums, com);
        for (Student s: nums)
        System.out.println(s);
    }
}

