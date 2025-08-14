package week4.day16;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

    public static void main(String[] args) {
        Queue<Integer> queue_int = new LinkedList<>();
        Queue<String> queue_str = new LinkedList<>();

        queue_int.add(1);
        queue_int.add(2);
        queue_int.add(3);

        queue_int.offer(2);//queue에 2를 넣음
        queue_int.remove();//젤 앞쪽 원소가 빠짐
        System.out.println(queue_int);
    }
}
