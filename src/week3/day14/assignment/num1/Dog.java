package week3.day14.assignment.num1;

public class Dog extends Animal{

    public Dog(int speed){
        super(speed);
    }

    public void run(int hours) {
        this.setDistance(this.getDistance()+ 0.5*hours*this.getSpeed());
        System.out.println("개의 이동거리="+ this.getDistance());
    }
}
