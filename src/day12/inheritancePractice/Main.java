package day12.inheritancePractice;

public class Main {
    public static void main(String[] args) {
        CC object = new CC();
        System.out.println(object.getAa());
        System.out.println(object.getBb());
        System.out.println(object.getCc());
        System.out.println(object.getDd());

        Son objSon = new Son();
        objSon.printDetails();
    }
}
