package week4.day16.Generic;

import java.util.ArrayList;
import java.util.List;

public class BoxModelMain {
    public static void main(String[] args) {
        BoxModel<String> box = new BoxModel<>();

        List<String> arr = new ArrayList<>();
        arr.add("배추");
        arr.add("무");
        arr.add("상추");
        arr.add("삼겹살");

        box.content = (ArrayList<String>)arr;

        for (String s : box.content) {
            System.out.println(s);
        }
    }
}
