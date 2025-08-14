package week2.day09.jungol.문자열2;
import java.util.*;
public class 형성평가3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arr = new String[50];

        int count = 0;
        while(true){
            String input = sc.nextLine();

            if(input.equals("0")) break;

            arr[count] = input;
            count++;
        }

        System.out.println(count);
        for(int i=0; i<count; i+=2){
            System.out.println(arr[i]);
        }
    }
}
