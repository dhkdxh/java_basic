package week3.day14.assignment.num1;

public class Chicken extends Animal implements Cheatable{

    public Chicken(int speed){
        super(speed);
    }

    @Override
    public void run(int hours) {
        this.setDistance(this.getDistance() + hours*this.getSpeed());
        System.out.println("닭의 이동거리="+this.getDistance());
    }

    @Override
    public void fly() {
        this.setSpeed(this.getSpeed()*2);
    }
}
