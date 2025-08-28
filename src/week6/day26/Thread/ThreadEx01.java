package week6.day26.Thread;

import java.sql.SQLOutput;

public class ThreadEx01 {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        //실행하는 thread 객체를 참조 얻기 위한 code
        System.out.println(mainThread.getName() + " 실행");

        for (int i = 0; i < 3; i++) {
            Thread threadA = new Thread(){
                @Override
                public void run() {
                    System.out.println(getName() + " 실행");
                }
            };
            threadA.start(); //getName()은 Thread의 인스턴스 메소드로 thread의 이름을 return 해줌
        }

        Thread chatThread = new Thread(){
            @Override
            public void run() {
                System.out.println(getName() + " 실행");
            }
        };
        //chatThread의 이름 바꾸기
        chatThread.setName("chatting-thread");
        chatThread.setPriority(Thread.MAX_PRIORITY);
        chatThread.start();
    }
}
