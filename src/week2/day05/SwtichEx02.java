package week2.day05;

import java.util.Scanner;

public class SwtichEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);

        switch(grade){
            case 'A':
                System.out.println("매우 우수");
                break;
            case 'B':
                System.out.println("우수");
                break;
            case 'C':
                System.out.println("노력하세요");
                break;
            default:
                System.out.println();
        }
    }
}
