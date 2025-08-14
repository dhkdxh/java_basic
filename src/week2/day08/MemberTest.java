package week2.day08;

public class MemberTest {
    private String name;
    private int age;
    private String phoneNum;
    private String email;
    private String place;
    private double weight;

    public MemberTest() {
        name = "";
        age = 0;
        phoneNum = "";
        email="";
        place = "";
        weight = 0;
    }

    public String getName(String name){
        this.name = name;
        return this.name;
    }

    public int getAge(int age){
        this.age = age;
        return this.age;
    }

    public String getPhone(String num){
        this.phoneNum = num;
        return this.phoneNum;
    }

    public String getEmail(String email){
        this.email = email;
        return this.email;
    }

    public String getPlace(String place){
        this.place = place;
        return this.place;
    }

    public double getWeight(double weight){
        this.weight = weight;
        return this.weight;
    }
}
