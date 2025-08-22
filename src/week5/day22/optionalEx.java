package week5.day22;
import java.util.*;

public class optionalEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);//현재 arraylist에 값이 하나도 없음 -> exception
        double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();

        //방법1
        OptionalDouble optionalDouble = list.stream()
                .mapToInt(Integer::intValue).average();
        //getAsDouble 할 필요 x -> 알아서 처리
        if(optionalDouble.isPresent()){
            System.out.println(optionalDouble.getAsDouble());
        }else{
            System.out.println("0.0");
        }

        //방법2
        double avg2 = list.stream()
                .mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println(avg2);
        //orElse 사용해서 list에 element가 하나도 없을 때 처리가능

        list.stream().mapToInt(Integer::intValue).average().ifPresent(System.out::println);
        //만약 현재 값이 있으면 출력하도록
    }
}
