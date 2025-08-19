package week5.day19;

public class Main {

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;

        Calculator calculator = new Calculator(number1, number2);
        //계산기 클래스를 생성해서 계산할 수 있도록 클래스 필드에 값을 전달
        //계산기가 실제로 작동하는 방법

        int result = calculator.calculate(new Operate(){
            public int operate(int a, int b) {
                return a + b;
            }
        });

        System.out.println(result);

        result = calculator.calculate(new Operate(){
            public int operate(int a, int b) {
                return a - b;
            }
        });
    }
}
