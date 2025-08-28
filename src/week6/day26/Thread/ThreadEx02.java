package week6.day26.Thread;


class Calculator{
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory1(int memory) {
        this.memory = memory;
        try {
            System.out.println(memory);
            Thread.sleep(2000); //2초간 일시정지
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " Interrupted" + this.memory);
        }
    } //동기화 method

    public void setMemory2(int memory) {
        synchronized (this) {
            this.memory = memory;
            try {
                System.out.println(memory);
                Thread.sleep(2000); //2초간 일시정지
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " Interrupted" + this.memory);
            }
        }
    } //동기화 블럭을 포함하는 method
}

class User1 extends Thread{
    private Calculator calculator;
    public User1() {
        setName("User1 Thread"); // thread 이름 변경
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory1(100); // 동기화 메소드 호출
    }
}

class User2 extends Thread{
    private Calculator calculator;
    public User2() {
        setName("User2 Thread"); // thread 이름 변경
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory2(200); // 동기화 메소드 호출
    }
}

public class ThreadEx02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        User1 user1 = new User1();
        user1.setCalculator(calculator);
        User2 user2 = new User2();
        user2.setCalculator(calculator);

        user1.start();
        user2.start();
    }
}
