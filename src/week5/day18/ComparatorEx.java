package week5.day18;

import java.util.Comparator;

public class ComparatorEx implements Comparator<Fruit2> {
    @Override
    public int compare(Fruit2 o1, Fruit2 o2) {
        if(o1.price == o2.price) return 0;
        else if(o1.price > o2.price) return 1;
        return -1;
    }//처음 들어오는 o1을 기준으로 생각해주면 쉬움
}
