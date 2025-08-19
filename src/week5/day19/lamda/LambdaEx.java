package week5.day19.lamda;

public class LambdaEx {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello Lambda!");
            }
        };

        Runnable runnable1 = () -> System.out.println("hello Lambda!");
    }
}
