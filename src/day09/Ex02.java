package day09;

public class Ex02 {

    public static void main(String[] args) {
        String str1 = "JAVA";
        String str2 = "JAVA";
        //리터럴 저장 방식: string constant pool 영역에 저장

        System.out.println(str1 == str2);

        String str3 = new String("JAVA");
        String str4 = new String("JAVA");
        //new 연산자 저장 방식: heap 영역에 저장

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        //문자열 데이터를 어떤 방식으로 저장하느냐에 따라
        //메모리 적재형태가 다르다.

        System.out.println(str1 == str3);
        System.out.println(str1.equals(str1));
    }
}
