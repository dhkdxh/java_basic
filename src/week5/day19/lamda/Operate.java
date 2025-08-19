package week5.day19.lamda;

public interface Operate {
    int operate(int a, int b);

    default void print(){
        System.out.println("print");
    }
}
