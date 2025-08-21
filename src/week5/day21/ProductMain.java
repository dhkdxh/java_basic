package week5.day21;

import java.util.*;
import java.util.stream.Stream;

public class ProductMain {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "pencil", "yewon", 1000));
        products.add(new Product(2, "book", "yewon", 10000));
        products.add(new Product(3, "cup", "yewon", 500));
        products.add(new Product(4, "rice", "yewon", 2000));
        products.add(new Product(5, "water", "yewon", 550));

        Stream<Product> stream = products.stream();
        stream.forEach(p -> System.out.println(p));
    }
}
