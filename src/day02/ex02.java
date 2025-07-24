package day02;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int var1,var2,var3,sum;

        System.out.println("Please enter the first number");
        var1= sc.nextInt();
















        
        System.out.println("Please enter the second number");
        var2 = sc.nextInt();
        System.out.println("Please enter the third number");
        var3 = sc.nextInt();

        sum = var1 + var2 + var3;

//        System.out.println(var1+var2+var3);
        System.out.println(var1 + "+" + var2 + "+" + var3 + " = " + sum);
        System.out.printf("%d + %d + %d = %d", var1,var2,var3,sum);
    }
}
