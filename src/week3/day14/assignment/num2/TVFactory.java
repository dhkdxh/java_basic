package week3.day14.assignment.num2;

public class TVFactory extends Factory implements IWorkingTogether{

    public TVFactory(String name, int openHour, int closeHour){
        super(name,openHour, closeHour);
    }

    @Override
    public int makeProducts(char skill) {
        int num;
        switch(skill){
            case 'A' -> num=8;
            case 'B' -> num=5;
            case 'C' -> num=3;
            default -> num=1;
        }
        return num * this.getWorkingTime();
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
//        int total = 0;
//        if(partner instanceof TVFactory factory){
//            total = factory.makeProducts('C');
//        }
//        return total;
        return ((TVFactory)partner).makeProducts('C');
    }
}
