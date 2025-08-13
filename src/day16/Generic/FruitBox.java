package day16.Generic;

import java.util.*;

public class FruitBox <T>{
     List<T> fruits = new ArrayList<>();

    public void add(T item){
        fruits.add(item);
    }
}
