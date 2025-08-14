package week3.day13.assignment.num3;

public class Bike extends Wheeler{

    public Bike(String carName, int velocity, int wheelNumber){
        this.carName = carName;
        this.velocity = velocity;
        this.wheelNumber = wheelNumber;
    }

    public void speedUp(int speed){
        if(this.velocity + speed >40){
            this.velocity=40;
            System.out.println("자전거의 최고속도위반으로 속도를 40으로 올립니다.");
            return;
        }
        this.velocity += speed;
        System.out.println("자전거의 현재 속도는 "+this.velocity+" 입니다.");
    }

    public void speedDown(int speed){
        if(this.velocity - speed < 10){
            this.velocity = 10;
            System.out.println("자전거의 최저속도위반으로 속도를 10으로 올립니다.");
            return;
        }
        this.velocity -= speed;
        System.out.println("자전거의 현재 속도는 "+this.velocity+" 입니다.");
    }
}
