package week5.day19;

import java.util.Comparator;
import java.util.TreeSet;

public class MainEx {
    public static void main(String[] args) {
        TreeSet<User> treeset  = new TreeSet<User>();
        TreeSet<User2> treeset2 = new TreeSet<>(new ComparatorEx());

        treeset.add(new User("박희동", 14));
        treeset.add(new User("홍길동", 32));
        treeset.add(new User("김동성", 48));
        treeset.add(new User("김유신", 64));

        treeset2.add(new User2("김유신", 64));
        treeset2.add(new User2("김동성", 48));
        treeset2.add(new User2("홍길동", 32));
        treeset2.add(new User2("박희동", 14));

        for(User u: treeset) System.out.println(u.getName());
        System.out.println();
        for(User2 u: treeset2) System.out.println(u.getName());
    }
}
