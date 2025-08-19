package week5.day19;

public class Ex01 {
    public static void main(String[] args) {
        action((x, y)-> {
            System.out.println(x*y);}
        );
        action((x,y) -> {
            System.out.println(x+y);}
        );
    }

    public static void action(Calculable calculable) {
        int x = 10;
        int y = 2;
        calculable.calculate(x,y);
    }
}
