package week5.day19;

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int compareTo(User o) {
        if(this.age > o.age) return 1;
        else if(this.age < o.age) return -1;
        return 0;
    }
}
