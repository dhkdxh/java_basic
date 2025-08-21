package week5.day21;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStreamEx {
    public static void main(String[] args) {
        String[] strings = new String[]{"1", "2", "3", "4", "5"};
        Stream<String> stream = Arrays.stream(strings);
        stream.forEach(item -> System.out.println(item + " "));

        Integer[] integers = new Integer[]{1, 2, 3, 4, 5};
        Stream<Integer> stream2 = Arrays.stream(integers);
        stream2.forEach(item -> System.out.println(item + " "));
    }
}
