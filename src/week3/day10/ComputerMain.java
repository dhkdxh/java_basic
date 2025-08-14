package week3.day10;

public class ComputerMain {
    static Computer computer = new Computer();

    public static void main(String[] args) {
        getNumber();
        printSum();
    }

    public static void getNumber(){
        for(int i=0; i<5; i++){
            computer.setNum(i, i+1);
        }
    }

    public static void printSum(){
        System.out.printf("1부터 5까지의 누적합은 %d 입니다.", computer.totalSum());
    }
}
