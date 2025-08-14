package week3.day14.assignment.num1;

public abstract class Animal {
    private int speed;
    private double distance;

    public Animal(int speed){
        this.speed = speed;
        this.distance=0;
    }

    public abstract void run(int hours);

    public double getDistance(){
        return this.distance;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
