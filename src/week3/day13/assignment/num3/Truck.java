package week3.day13.assignment.num3;

public class Truck extends Wheeler{

    public Truck(String carName, int velocity, int wheelNumber){
        this.carName = carName;
        this.velocity = velocity;
        this.wheelNumber = wheelNumber;
    }

    public void speedUp(int speed){
        if(speed*5 + this.velocity > 100){
            this.velocity=100;
            System.out.println("트럭의 최고속도위반으로 속도를 100으로 올립니다.");
            return;
        }
        this.velocity += speed*5 ;
        System.out.println("트럭의 현재 속도는 "+ this.velocity + " 입니다.");
    }

    public void speedDown(int speed){
        if(this.velocity-speed*5 < 50){
            this.velocity = 50;
            System.out.println("트럭의 최저속도위반으로 속도를 50으로 올립니다.");
            return;
        }
        this.velocity -= speed*5;
        System.out.println("트럭의 현재 속도는 "+ this.velocity + " 입니다.");
    }
}
