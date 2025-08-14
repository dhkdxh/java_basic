package week4.day16.Generic;

public class Main {
    public static void main(String[] args) {
        FruitBox<Fruit> box = new FruitBox<>();

        box.add(new Fruit());
        box.add(new Apple());
        box.add(new Banana());
        box.add(new Pear());
    }
}
