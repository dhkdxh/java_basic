package week2.day09.jungol.문자열1;
import java.util.*;

public class 형성평가6 {
    static Scanner sc =  new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine();

        int lengthOfS = s.length();

        while(lengthOfS > 1){
            int index = sc.nextInt();

            if(index>=lengthOfS){
                s = s.substring(0, s.length()-1);
            }else{
                s = s.substring(0,index-1)+s.substring(index, lengthOfS);
            }
            System.out.println(s);
            lengthOfS--;
        }
    }
}
