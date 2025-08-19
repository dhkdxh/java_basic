package week5.day18;

import java.util.TreeSet;

public class Fruit implements Comparable<Fruit>{
    public String name;
    public int price;

    public Fruit(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Fruit o) {// this.price를 기준으로
        if(this.price < o.price) return -1;//앞에 오게 하려면
        else if(this.price > o.price) return 1;//뒤에 오게 하려면
        else return 0;
    }

    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("Apple", 10000);
        Fruit fruit2 = new Fruit("Tangerine", 12000);
        Fruit fruit3 = new Fruit("Grape", 18000);

        TreeSet<Fruit> treeSet = new TreeSet<Fruit>();

        treeSet.add(fruit1);
        treeSet.add(fruit2);
        treeSet.add(fruit3);

        for(Fruit f : treeSet){
            System.out.println(f.name + " " + f.price);
        }

    }
}


