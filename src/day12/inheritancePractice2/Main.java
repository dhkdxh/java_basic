package day12.inheritancePractice2;

public class Main {
    public static void main(String[] args) {
        Inheritance01 obj = new Inheritance01();

        int a = 20, b = 10;

        System.out.println("두 수의 덧셈: "+ obj.addition(20,10));
        System.out.println("두 수의 뺄셈: "+ obj.subtraction(20,10));
        System.out.println("두 수의 곱셈: "+ obj.multiplication(20,10));
    }
}
