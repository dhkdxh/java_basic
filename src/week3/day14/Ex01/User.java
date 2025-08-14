package week3.day14.Ex01;

public class User {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Tv();
        rc.turnOn();
        System.out.println("TV의 최대 볼륨 확인: "+RemoteControl.MAX_VOLUME);
        System.out.println("TV의 최소 볼륨 확인: "+RemoteControl.MIN_VOLUME);
        rc.controlVolume(10);
        rc.controlVolume(11);
        rc.setMute(true);
        rc.setMute(false);
        RemoteControl.changeBattery();

        //리모컨을 통해서 청소기를 동작시키려 한다.
        //1. 전원을 키고
        //2. 청소를 시킨다.


    }
}
