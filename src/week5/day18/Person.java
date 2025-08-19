package week5.day18;

public class Person implements Comparable<Person>{
    public String name;
    public int age;

    public Person( String name, int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        if(this.age < o.age) return -1;
        else if(this.age > o.age) return 1;
        return 0;
    }
}
