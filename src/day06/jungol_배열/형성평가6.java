package day06.jungol_배열;
import java.util.*;

public class 형성평가6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char[] arr = {'J', 'U', 'N', 'G', 'O', 'L'};

        char c = sc.nextLine().charAt(0);
        for(int i=0; i<6; i++){
            if(c==arr[i]) {
                System.out.print(i);
                return ;
            }
        }
        System.out.println("none");
    }
}
