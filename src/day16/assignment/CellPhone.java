package day16.assignment;

public class CellPhone{
    private String model;
    private double battery;

    CellPhone(String model){
        this.model = model;
        this.battery= 0.0;
    }

    public void call(int time) throws IllegalArgumentException{
        if(time<0) {
            throw new IllegalArgumentException("통화시간입력오류");
        }
        System.out.print("통화 시간 : "+time+"분\n");
        if(this.battery < time * 0.5) this.battery = 0;
        else this.battery -= time * 0.5;
    }

    public void charge(int time) throws IllegalArgumentException{
        if(time<0) throw new IllegalArgumentException("충전시간입력오류");
        System.out.print("충전 시간 : "+time+"분\n");
        if(this.battery + time*3 > 100) this.battery = 100;
        else this.battery += time*3;
    }

    public void printBattery(){
        System.out.println("남은 배터리 양 : "+ this.battery);
    }
}
