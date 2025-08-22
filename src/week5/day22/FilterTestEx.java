package week5.day22;

import java.util.*;
import java.util.stream.Collectors;

public class FilterTestEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Cat","Darlie","Emy");

        //이름 중 A로 시작하는 이름을 수집하여 출력
        List<String> temp = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(temp);
        System.out.println("--------------------------");
//        temp.stream().forEach(System.out::println);

        List<String> names2 = Arrays.asList("Alice", "Bob", "Cat");

        //각 이름의 길이를 세어서 출력하시오 (2가지 방법..)
        names2.stream()
                .mapToInt(name -> name.length())//length는 정적 method이므로 String::length로도 ok
                .forEach(System.out::println);
    }
}
