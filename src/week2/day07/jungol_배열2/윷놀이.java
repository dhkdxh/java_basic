package week2.day07.jungol_배열2;
import java.util.*;

public class 윷놀이 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        int[] answer = new int[3];

        for(int i=0; i<3; i++){
            int count = 0;
            for(int j=0; j<4; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j] == 0) count++;
            }
            answer[i] = count;
        }

        for(int i=0; i<3; i++){
            switch(answer[i]){
                case 4:
                    System.out.println("D");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 1:
                    System.out.println("A");
                    break;
                default:
                    System.out.println("E");
            }
        }
    }
}
