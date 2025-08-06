package day12.inheritancePractice;

public class Son extends Father{
    private String name = "홍길동";

    public void printDetails(){
        System.out.println("나의 이름은 "+ this.name);
        System.out.println("나의 아버지는 "+ getFamilyName());
        System.out.println("나의 집은 "+ getHouseAddress());
    }
}
