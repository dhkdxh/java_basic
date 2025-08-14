package week4.day17.practice;

public class Member {
    public String name;
    public int age;

    Member(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {//회원마다 고유한 값을 가지게 될 것임
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member target){
            return target.name.equals(this.name) && (target.age == age);
        }
        return false;
    }
}
