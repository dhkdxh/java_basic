package week2.day05.jungol.반복제어문2;

public class 연습문제2_2 {
    public static void main(String[] args) {
        for(int i=65; i<91; i++){
            char c = (char)i;
            System.out.print(c);
        }

//        int ch = 65;
//        for(int i=1; i<=26; i++){
//            System.out.printf("%c", ch);
//            ch += i;
//        }

//        IntStream intstream = IntStream.rangeClosed(65,90);
//        intstream.forEach(n -> System.out.print((char)n));
    }
}
