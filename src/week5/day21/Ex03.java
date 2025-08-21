package week5.day21;

import java.util.stream.IntStream;

public class Ex03 {
    public static int sum = 0;
    public static void main(String[] args) {
        IntStream s1_100 = IntStream.rangeClosed(1,100);
        s1_100.forEach(number -> sum += number);
        System.out.println(sum);
    }
}
