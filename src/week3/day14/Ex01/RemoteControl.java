package week3.day14.Ex01;

public interface RemoteControl {
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 30;
    //최대 볼륨은 30
    //최소 볼륨은 0
    public void turnOn();
    public void turnOff();
    public void controlVolume(int volume);
    public void setMute(boolean mute);

    //default 인스턴스 메소드
//    default void setMute(boolean mute){
//        if(mute){
//            System.out.println("무음 처리 되었습니다.");
//            controlVolume(MIN_VOLUME);
//        }else{
//            System.out.println("무음 해제 되었습니다.");
//        }
//        coolDown(); -> 이렇게 실행가능
//    }
    public static void changeBattery(){
        System.out.println("리모컨 건전지를 교환해야 합니다.");
    }

    private void coolDown(){
    }
}
