package day14.Ex01;

public class User2 {
    public static void main(String[] args) {
        Service service = new ServiceImpl();

        service.defaultMethod1();
        service.defaultMethod2();

        Service.staticMethod2();
        Service.staticMethod1();
    }
}
