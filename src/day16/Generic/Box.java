package day16.Generic;

public class Box {
    //box에 넣을 내용물을 content field로 선언하려고 함
    public Object content;
    //Object type은 모든 클래스의 super class이므로 자동변환이 가능함
    //content는 어떤 객체든 대입이 가능

    public static void main(String[] args) {
        Box box = new Box();
        box.content = "바비인형";
        box.content = 100;
        //문제 발생 -> Box안의 content를 얻어낼 때
        //content는 Object type이므로 어떤 객체가 대입되어있는지 확실하게 알 수 없음
        String doll = (String)box.content;
        //어떤 타입이 저장되었는지 모른다면 instanceof를 사용해볼 수도 있음 -> 타입이 너무 많음
    }
}
