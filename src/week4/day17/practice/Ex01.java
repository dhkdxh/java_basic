package week4.day17.practice;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        //시작시간과 끝시간을 저장할 변수
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(i, String.valueOf(i));
        }

        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "ArrayList 데이터 삽입 시간 : ", (endTime- startTime));

        long startTime1,endTime1;
        startTime1 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(i, String.valueOf(i));
        }

        endTime1 = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "LinkedList 데이터 삽입 시간 : ", (endTime1- startTime1));
    }
}
