package week5.day22;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.*;

@Getter
@AllArgsConstructor
class Student{
    private String name;
    private int score;
}

public class mappingEx {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("yewon", 90),
                new Student("taemin", 80),
                new Student("sarah", 70)
        );

        list.stream()
                .mapToInt(student ->student.getScore())
                .forEach(System.out::println);

        int sum = list.stream()
                .mapToInt(student -> student.getScore())
                .sum();
        System.out.println(sum);

        double avg = list.stream()
                .mapToInt(student ->student.getScore())
                .average()
                .getAsDouble();
        System.out.printf("%.1f", avg);
    }
}
