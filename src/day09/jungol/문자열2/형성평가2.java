package day09.jungol.문자열2;
import java.util.*;

public class 형성평가2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arr = {"flower", "rose", "lily", "daffodil", "azalea"};

        char input = sc.nextLine().charAt(0);

        int count = 0;
        for (String s : arr) {
            for(int i=0; i<3; i++){
                char c = s.charAt(i);
                if(c == input){
                    count += (i==2 || i==1)? 1 : 0;
                }
            }
        }
        System.out.println(count);
    }
}
