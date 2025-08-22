package week5.day22;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.*;

@AllArgsConstructor
@Getter
class Student1{
    private String name;
    private int score;
}

public class AggEx {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 92),
                new Student("David", 95),
                new Student("Bob", 88)
        );
        //합계
        int sum1 = students.stream().mapToInt(Student::getScore).sum();
        int sum2 = students.stream().mapToInt(Student::getScore).reduce(0, (a,b) -> a+b);
    }
}
