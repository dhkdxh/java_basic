package day13.sec1;

public class Computer extends Calculator{
    //메소드 오버라이딩
    public Computer(){
        super();
    }

    @Override
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        double rr = super.areaCircle(r); // 부모를 호출할 때
        return Math.PI * r * r;
    }
}
