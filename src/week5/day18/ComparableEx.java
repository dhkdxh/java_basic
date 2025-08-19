package week5.day18;

import java.util.TreeSet;

public class ComparableEx {
    public static void main(String[] args) {
        Person p1 = new Person("John", 22);
        Person p2 = new Person("Adam", 21);
        Person p3 = new Person("Amy", 27);

        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        for(Person p : treeSet) System.out.println(p.name);
        //비교할 때 compareTo를 overriding 했기 때문에 age를 비교해서
        //알아서 비교해줌


    }
}
