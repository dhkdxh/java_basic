package day06;

public class Ex02 {
    public static void main(String[] args) {
        while(true){
            int num = (int)(Math.random()*6)+1;
            System.out.println(num);

            if(num==6) break;
        }

        System.out.println("게임종료");

        //반복문 중첩시 break; 범위 확인해줘야함
        Outter:
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                if(i==1 && j==2) break Outter;
            }
        }
    }
}
