package week2.day09.jungol.문자열2;
import java.util.*;

public class 형성평가5 {
    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        String[] arr = new String[5];

        for(int i=0; i<5; i++){
            arr[i] = sc.nextLine();
        }

        char c = sc.nextLine().charAt(0);
        String s = sc.nextLine();

        int count = 0;
        for (String string : arr) {
            if(string.indexOf(c) != -1 || string.contains(s)){
                count++;
                System.out.println(string);
            }
        }
        if(count == 0) System.out.println("none");
    }
}
