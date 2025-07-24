package day03.jungol;
import java.util.*;

public class 입력_형성평가5 {
    public static void main(String[] args) {
        System.out.print("yard? ");
        Scanner sc = new Scanner(System.in);

        double yard = sc.nextDouble();
        double cen = yard * 91.44;

        System.out.printf("%.1fyard = %.1fcm",yard,cen);
    }

}
