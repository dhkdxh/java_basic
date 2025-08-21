package week5.day21;

import java.util.*;
import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args) {

        List<String> list=  new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        //list collection에서 저장되어 있는 element를 하나씩 처리하는 for문
        for (int i = 0; i < list.size(); i++) {
            String item = args[i];
            System.out.println(item);
        }

        for (String s : list) {
            System.out.println(s);
        }

        //iterator 사용
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }

        //stream 방식 이용 -> duplex 가능함
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        //Set에 홍길동, 김나무, 김꽃분 세명의 회원을 저장하고 회원의 이름을 stream을 이용하여 출력
        Set<String> names = new TreeSet<>();
        names.add("홍길동");
        names.add("김나무");
        names.add("김꽃분");

        Stream<String> stream2 = names.stream();
        stream2.forEach(System.out::println); // 정적 method를 처리하는 방식
        stream2.forEach(name  -> System.out.println(name));
    }
}
