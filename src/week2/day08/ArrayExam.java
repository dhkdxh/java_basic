package week2.day08;

public class ArrayExam {
    public static void main(String[] args) {
        char[] c= {'A', 'B', 'C', 'D', 'E'};

        for(char i : c){
            i = Character.toLowerCase(i);
            System.out.println(i);
            //System.out.println(Character.toLowerCase(i)); -> 바로 출력
        }

        System.out.println();
        String s = "A";
        s = s.toLowerCase();
        System.out.println(s);
    }
}
