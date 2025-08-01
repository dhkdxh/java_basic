package day09;

public class Ex04 {
    public static void main(String[] args) {
        String result = "";
        result += "Hello";
        result += " ";
        result += "Java Programming";
        System.out.println(result); //+연산자 이용하여 String instance를 결합,
        //내용이 합쳐진 새로운 instance 생성되며, 결합하면 할 수록 메모리 낭비 + 속도 느려짐

        StringBuffer sb1 = new StringBuffer();// 조작을 위한 class
        sb1.append("hello");
        sb1.append(" ");
        sb1.append("java programming");
        String result1 = sb1.toString();
        //마지막 값은 무조건 String에 저장하기
        System.out.println(result1);
        //StringBuffer은 append method를 사용하여 메모리 낭비를 줄임

        String str = "abcdefg";
        StringBuffer sb = new StringBuffer(str);
        System.out.println("초기상태 : "+sb.toString());
        //str문자열에서 c-e 출력하는 방법
        System.out.println("문자열 추출 : "+ str.substring(2,5));

        //StringBuffer에서 문자를 추가하는 방법 insert(index, 추가문구)
        System.out.println("문자 삽입 : " + sb.insert(2, "k추가"));

        //StringBuffer에서 문자를 삭제하는 방법
        System.out.println("문자 삭제 : "+ sb.delete(2,5));

        //buffer 용량 보는 방법
        System.out.println("용량 : "+ sb.capacity());

        //문자열의 역순
        System.out.println("문자열 역순 : "+ sb.reverse());
    }
}
