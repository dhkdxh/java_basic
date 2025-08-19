package week5.day19;

import java.util.Comparator;

public class ComparatorEx implements Comparator<User2> {

    @Override
    public int compare(User2 o1, User2 o2) {
        if(o1.getAge() > o2.getAge()) return 1;
        else if(o1.getAge() < o2.getAge()) return -1;
        return 0;
    }
}
