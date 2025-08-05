package day11.morningtest;
//단 하나의 객체를 만들기 위한 코드 패턴(singleTon)
public class ShopService {
    private static ShopService instance;

    private ShopService() {
    }

    public static ShopService getInstance(){
        if(instance == null){
            instance = new ShopService();
        }
        return instance;
    }
}
