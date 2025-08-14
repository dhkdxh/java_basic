package week4.day17.practice;

import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        //객체 저장
        set1.add("Java");
        set1.add("JDBC");
        set1.add("JSP");
        set1.add("JSP");
        set1.add("Spring");

        int size = set1.size();
        System.out.println(size);//4

        Set<Member> set2 = new HashSet<>();

        set2.add(new Member("신세계", 30));
        set2.add(new Member("신세계", 30));
        set2.add(new Member("신세경", 30));
        //equals를 overriding 했기 때문에 HashSet은 오버라이딩된 equals를 사용해서 비교

        size = set2.size();
        System.out.println(size);//2

        Iterator<Member> iter = set2.iterator();

        while(iter.hasNext()){
            Member mem = iter.next();
            System.out.println(mem.name + " "+ mem.age);
        }

        for(Member m : set2){
            System.out.println(m.name + " "+ m.age);
        }
    }
}
