package week5.day22;
import java.util.*;
import java.util.stream.Collectors;

public class sortedEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "신세계", "김용진", "정현주", "남기주"
        );
        //자연순으로 정렬하여 출력하세요.

        List<String> sortedNames = names.stream()
                .sorted().toList();
        System.out.println(sortedNames);

        List<String> sortedNames2 = names.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedNames2);

        List<String> names2 = Arrays.asList("Alice", "Bob", "Carl", "Dan", "Eve", "Adan");
        names2.stream()
                .filter(name -> name.toUpperCase().startsWith("D"))
                .map(name -> name.toUpperCase())
                .sorted().forEach(System.out::println);
    }
}
