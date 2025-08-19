package week5.day18;

import java.util.*;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> score = new TreeSet<>();

        score.add(87);
        score.add(98);
        score.add(76);
        score.add(54);
        score.add(80);

        for(Integer i : score){
            System.out.println(i);
        }

        //특정 점수 객체를 가져오기
        System.out.println("가장 낮은 점수 : " + score.first());
        System.out.println("가장 높은 점수 : " + score.last());
        System.out.println("95점보다 낮은 점수 : " + score.lower(95));
        System.out.println("95점보다 높은 점수 : " + score.higher(95));
        System.out.println("95점이거나 바로 아래 점수 : " + score.floor(95));
        System.out.println("85점이거나 바로 위 점수 : " + score.ceiling(85));
        System.out.println();

        //내림차순으로 정렬하려면?
        NavigableSet<Integer> reverseOrder = score.descendingSet();
        for(Integer i : reverseOrder){
            System.out.println(i);
        }
        System.out.println();

        //범위 검색 (80<=) -> 여기서 true는 해당 수를 포함할거냐 안할거냐를 정할 수 있음
        NavigableSet<Integer> rangeSet = score.tailSet(80, true);
        for(Integer i : rangeSet){
            System.out.println(i);
        }
        System.out.println();

        //범위 검색 (80 <= score <= 90)
        rangeSet = score.subSet(80, true, 90, true);
        for(Integer i : rangeSet){
            System.out.println(i);
        }
        System.out.println();

    }
}
