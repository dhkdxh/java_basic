package week5.day22;

import java.util.Optional;

public class OptionalEx02 {
    public static void main(String[] args) {
        String str = "Hello Optional!";
        Optional<String> optional = Optional.of(str);
        System.out.println(optional);

        String nullStr = null;
        Optional<String> optNullStr = Optional.ofNullable(nullStr);//null이 의심되는 경우
        System.out.println(optNullStr);
        //NullPointerException으로 처리되지 않음

        Optional<String> emptyOptional = Optional.empty();
        //값을 갖지 않는 빈 Optional 객체 생성
        System.out.println(emptyOptional);
        //Optional.empty
    }
}
