package week3.day14.Ex01;

public interface Service {
    //default method
    default void defaultMethod1(){
        System.out.println("default1()");
        defaultCommon();
    }
    default void defaultMethod2(){
        System.out.println("default2()");
        defaultCommon();
    }
    //private method
    private void defaultCommon(){
        System.out.println("default method의 중복코드 A");
        System.out.println("default method의 중복코드 B");
    }

    //static method
    public static void staticMethod1(){
        System.out.println("staticMethod1()");
        staticCommon();
    }
    public static void staticMethod2(){
        System.out.println("staticMethod2()");
        staticCommon();
    }

    //private static method
    private static void staticCommon(){
        System.out.println("staticMethod의 중복코드 A");
        System.out.println("staticMethod의 중복코드 B");
    }
}
