package day14.assignment.num2;

public class CarFactory extends Factory implements IWorkingTogether{

    public CarFactory(String name, int openHour, int closeHour){
        super(name,openHour,closeHour);
    }

    @Override
    public int makeProducts(char skill) {
        int num;
        switch(skill){
            case 'A' -> num=3;
            case 'B' -> num=2;
            case 'C' -> num=1;
            default -> num=0;
        }
        return num * this.getWorkingTime();
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        int total = 0;
        if(partner instanceof Factory factory){
            total = factory.makeProducts('B');
        }
        return total;
    }
}
