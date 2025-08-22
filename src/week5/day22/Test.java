package week5.day22;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<Integer> evenList = list.stream()
                .filter(i -> i%2==0).toList();
        System.out.println(evenList);

        list.stream().map(i -> i*i).forEach(System.out::println);

        List<String> strList =  Arrays.asList(
                "yewon","yewon3", "yewon", "yewon2" ,"yewon1" 
        );

        List<String> temp1 = strList.stream().distinct().toList();
        System.out.println(temp1);

        List<Integer> list2 = Arrays.asList(5,3,4,2,1);

        List<Integer> sortedList2 = list2.stream().sorted().toList();
        System.out.println(sortedList2);

        Integer sum = list2.stream()
                .filter(i -> i%2==0)
                .mapToInt(i->i).sum();//IntStream으로 변환하는 과정이 꼭 필요
        System.out.println(sum);

    }
}
