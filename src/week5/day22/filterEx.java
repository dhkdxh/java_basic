package week5.day22;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class filterEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                new String("Yewon"),
                new String("Yewon"),
                new String("Sarah"),
                new String("Bob"),
                new String("Taemin")
        );

        names.stream().forEach(name -> System.out.println(name));
        names.stream().distinct().forEach(System.out::println);
        System.out.println();
        names.stream()
                .distinct()
                .filter(name -> name.toLowerCase().startsWith("y"))
                .forEach(System.out::println);
    }
}
