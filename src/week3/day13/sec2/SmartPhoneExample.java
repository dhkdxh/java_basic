package week3.day13.sec2;

public class SmartPhoneExample {
    public static void main(String[] args) {
        //SmartPhone 객체 생성
        SmartPhone smartPhone = new SmartPhone("갤럭시s24", "white");
        //모델 = 갤럭시s24, 색상은 화이트

        //Phone으로부터 상속받은 필드 읽기
        System.out.println(smartPhone.model);
        System.out.println(smartPhone.color);


        //SmartPhone의 필드 읽기
        System.out.println("와이파이 현재 상태 체크: " + smartPhone.wifi);
        smartPhone.setWifi(true);
        System.out.println("와이파이 현재 상태 체크: " + smartPhone.wifi);

        //Phone으로부터 상속받은 메소드 호출
        smartPhone.bell();
        smartPhone.receiveVoice("안녕하세요.");
        smartPhone.sendVoice("어.... 킹깐만");
        smartPhone.hangUp();

        //SmartPhone의 메소드 호출
        smartPhone.internet();
    }
}
