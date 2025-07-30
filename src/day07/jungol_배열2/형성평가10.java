package day07.jungol_배열2;
import java.util.*;

public class 형성평가10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] arr = new char[3][5];

        for(int i=0; i<3; i++){
            String s = sc.nextLine();
            int index = 0;
            for(int j=0; j<s.length(); j+=2){
                arr[i][index] = s.charAt(j);
                index++;
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                arr[i][j] += 32;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
