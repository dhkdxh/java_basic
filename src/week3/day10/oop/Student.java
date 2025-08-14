package week3.day10.oop;

public class Student {
    private String stu_name;
    private int stu_age;
    private String address;
    private String stu_ssn;
    private int[] score;
    private int sum;

    //constructor method를 통하여 member field 초기화
    public Student(){//default 생성자
        score = new int[3];
        sum=0;
    }

    public Student(String name, String ssn){
        this.stu_name = name;
        this.stu_ssn = ssn;
    }

    public Student(String name, String ssn, int age, String address){
        this.stu_name = name;
        this.stu_ssn = ssn;
        this.stu_age = age;
        this.address = address;
    }


    @Override
    public String toString() {
        return "Student{" +
                "stu_name='" + stu_name + '\'' +
                ", stu_age=" + stu_age +
                ", address='" + address + '\'' +
                ", stu_ssn='" + stu_ssn + '\'' +
                '}';
    }

    public void setScore(int index, int num){
        this.score[index] = num;
    }

    public int getScore(int index){
        return this.score[index];
    }

    public int getSum(){
        for (int i : score) {
            sum += i;
        }
        return sum;
    }

    public int getAvg(){
        return sum/3;
    }
}
