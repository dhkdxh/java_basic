package day13.sec5;

public class M1 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Rectangle();
        shapes[1] = new Triangle();
        shapes[2] = new Circle();

        Circle circle = (Circle) shapes[2];
    }
}
