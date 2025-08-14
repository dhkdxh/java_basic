package week2.day09;

public class Ex03 {

    public static void main(String[] args) {

        String subject = "자바객체프로그래밍";
        char charValue = subject.charAt(0);
        System.out.println(charValue);

        String ssn = "9508213456123";
        char gender = ssn.charAt(6);
        switch(gender){
            case '1': case '3':
                System.out.println("남성");
                break;
            case '2': case '4':
                System.out.println("여성");
                break;
        }

        //문자열 대체 기능 : replace("원본", "바꾸고 싶은 문자열")
        String oldstr = "신세계 자바 과정";
        String newStr = oldstr.replace("과정" , "백엔드 과정");
        System.out.println(newStr);

        //특정 위치의 문자열을 잘라내어 사용하고 싶을 때 사용하는 substring();
        String newStr2 = oldstr.substring(4);
        String newStr3 = oldstr.substring(4,6);//endindex는 포함이 안됨
        //startindex<= 숫자 <endindex
        System.out.println(newStr2 + " "+ newStr3);

        //문자열에서 특정 문자의 위치를 찾을 때 indexOf() method 사용
        int index = subject.indexOf("프로그래밍"); //4
        //만약, 해당 문자열을 찾을 수 없다면 indexOf는 -1을 할당함
        System.out.println(index);

        //문자열의 포함여부를 확인하는 contains() method
        boolean result = subject.contains("프로그래밍");
        System.out.println(result);

        //문자열 분리하는 spilt() method
        String board = "번호, 제목, 내용, 설명";
        String[] boardStr = board.split(",");
        System.out.println(boardStr[0]);
        //split의 parameter에 들어가는 것을 delimiter이라 하며, 반드시 string type 이어야함
    }
}
