package week5.day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex02 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("김진우", 90));
        students.add(new Student("이종우", 80));
        students.add(new Student("박진우", 60));

        List<Student> studentList = Arrays.asList(
                new Student("김진우", 90),
                new Student("이종우", 80),
                new Student("박진우", 60)
        );

        //스트림 -> 중간처리 -> 최종처리 -> 학생들의 평균 점수
        Stream<Student> stream1 = students.stream();

        IntStream scoreStream = stream1.mapToInt(//정수형 값만 scoreStream
                student -> student.getScore()
        );

        double averageScore = scoreStream.average().getAsDouble();
        System.out.println(averageScore);

        //람다식을 주입하여 pipeline 방식으로 처리하는 방법
        double averageScore2 = studentList.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();
        System.out.println(averageScore2);
    }
}
