package week1.day04;

public class PrintEx {
    public static void main(String[] args) {
        System.out.printf("%d \n", 123);

        System.out.printf("%6d\n",123); // ___123

        System.out.printf("%-6d\n",123); //123___

        System.out.printf("%06d\n",123); //000123

        System.out.printf("%10.2f\n", 123.45);//자릿수는 소수점까지 세기
        System.out.printf("%010.2f\n", 123.45);//앞에 0을 채우고

        //문자열은 %s 포맷이 정해져있음  -> abc 출력
        //%를 출력하고 싶으면 %%로 표현해 줄 수 있음
    }
}
