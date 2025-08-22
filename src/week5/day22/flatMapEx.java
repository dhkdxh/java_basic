package week5.day22;

import java.util.*;
import java.util.stream.Collectors;

public class flatMapEx {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a"),
                Arrays.asList("b", "c"),
                Arrays.asList("d", "e"),
                Arrays.asList("f", "g"),
                Arrays.asList("h", "i")
        );

        List<String> allNames = listOfLists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        //평탄화작업...
        System.out.println(allNames);
    }
}
