package day13.sec4;
class A{}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class PromotionExample {

    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;//상속 관계 이므로 b객체변수에 저장된 주소값은 부모인 a1에 담을 수 있음
        A a2 = c;
        A a3 = d;//ok
        A a4 = e;

        A mya = new B(); // ok

        B b1 = d;
    }
}
