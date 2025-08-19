package week5.day18;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorEx02 {
    public static void main(String[] args) {
        TreeSet<Fruit2> fruits = new TreeSet<>(new ComparatorEx());
        //현재 Fruit2는 비교기준이 없으므로 parameter에 comparator를 넘겨줘야함

        fruits.add(new Fruit2("Apple", 10));
        fruits.add(new Fruit2("banana", 20));
        fruits.add(new Fruit2("Grape", 30));

        for(Fruit2 fruit: fruits) System.out.println(fruit.name);
    }
}
