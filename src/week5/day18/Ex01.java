package week5.day18;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        //insert
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        System.out.println(map.size());

        //read/get the object
        String key = "A";
        int value = map.get(key);
        System.out.println(value);

        //키 set을 이용해서 반복해서 value를 일고 싶음
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()){
            String key1 = iterator.next();
            Integer value1 = map.get(key1);
            System.out.println(key1 + ":" + value1);
        }

        //모든 key와 value를 entryset으로 만들어버리기
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryiter = entrySet.iterator();
        while(entryiter.hasNext()){
            String k = entryiter.next().getKey();
            Integer v = entryiter.next().getValue();
            System.out.println(k + " : " + v);
        }

        for(Map.Entry<String, Integer> entrt : entrySet){
            System.out.println(entrt.getKey() + " : " + entrt.getValue());
        }
    }
}
