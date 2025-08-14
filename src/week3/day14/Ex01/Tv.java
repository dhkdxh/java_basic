package week3.day14.Ex01;

public class Tv implements RemoteControl {
    private int volume;
    private int memoryVolume;

    public void controlVolume(int volume){
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else this.volume = volume;

        System.out.println("현재 볼륨값: "+this.volume);
    }
    @Override
    public void turnOn() {
        System.out.println("TV 전원을 켠다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 전원을 끈다");
    }

    public void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리 되었습니다.");
            this.memoryVolume  = this.volume;
            controlVolume(MIN_VOLUME);
        }else{
            System.out.println("무음 해제 되었습니다.");
            controlVolume(memoryVolume);
        }
    }
}
