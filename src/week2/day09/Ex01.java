package week2.day09;

public class Ex01 {

    public static void main(String[] args) {
        String refVar1 = null;
        String refVar2 = null; // assignment 해놔야 공간이 생성됨

        refVar1 = new String("자바"); //heap

        //refVar1 = "자바" -> 와는 할당하는 메모리 공간이 다름 literal
        refVar2 = "자바";
        String refVar3 = "자바";
        String refVar4 = null;

        System.out.println(refVar1 == refVar2);
        System.out.println(refVar1 == refVar3);
        System.out.println(refVar2 == refVar3);
        System.out.println("--------------------");
        System.out.println(refVar1.equals(refVar2));
        System.out.println(refVar2.equals(refVar3));
        System.out.println("--------NullPointException------------");
        System.out.println(refVar4);
        System.out.println(refVar4.length()); // nullpointexception
    }
}
