package week5.day22.Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList< >();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("감자바", "남", 95));
        totalList.add(new Student("오해영", "여", 93));

        //남학생만 묶어 List 생성
        Map<String, List<Student>> map = totalList.stream().collect(Collectors.groupingBy(student -> student.getGender()));
        List<Student> maleList = map.get("남");
        maleList.stream().forEach(student -> System.out.println(student.getName()));

        List<Student> femaleList = map.get("여");
        femaleList.stream().forEach(student -> System.out.println(student.getName()));


        //남,녀 학생들의 평균 점수를 각각 구하세요.
        Map<String, Double> map1 = totalList.stream()
                .collect(Collectors.groupingBy(student -> student.getGender(), Collectors.averagingInt(student -> student.getScore())));

        System.out.println(map1);
         Map<String, Integer> map2 = totalList.stream()
                 .collect(Collectors.toMap(s -> s.getName(), s->s.getScore()));
         System.out.println(map2);
    }
}