package week5.day19;

//계산을 담당하는 class
public class Calculator {
    //계산이 필요한 두 수를 저장하는 field
    private final int number1;
    private final int number2;

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    //인터페이스 타입을 매개변수로 받는 메소드
    public int calculate(Operate op){
        return op.operate(this.number1, this.number2);
    }
}
