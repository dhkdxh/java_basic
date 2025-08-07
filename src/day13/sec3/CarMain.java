package day13.sec3;

public class CarMain {
    public static void main(String[] args) {
        Car mycar = new Car();

        mycar.tire = new Tire();
        mycar.run();

        mycar.tire = new KumhoTire();
        mycar.run();

        mycar.tire = new HanKookTire();
        mycar.run();
    }
}
