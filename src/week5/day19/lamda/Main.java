package week5.day19.lamda;

public class Main {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        Calculator calculator = new Calculator(num1,num2);

        //람다식을 이용하여 저 간결하게 사용가능
        Operate operate = (int n1, int n2) -> n1+n2;

        int result  = calculator.calculate(operate);

        System.out.println(result);
    }
}
