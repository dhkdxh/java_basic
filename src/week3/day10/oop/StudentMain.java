package week3.day10.oop;

public class StudentMain {

    public static void main(String[] args) {
        Student yewon = new Student();

        Student stu1 = new Student("yewon", "12345");

        Student stu2 = new Student("yewon", "12345", 22, "Seoul");

        System.out.println(yewon.toString());
        System.out.println(stu1.toString());
        System.out.println(stu2.toString());

        yewon.setScore(0,100);
        yewon.setScore(1,90);
        yewon.setScore(2, 80);

        System.out.println(yewon.getScore(0));
        System.out.println(yewon.getSum());
        System.out.println(yewon.getAvg());
    }
}
