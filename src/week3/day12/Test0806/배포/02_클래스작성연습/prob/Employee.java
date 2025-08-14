public class Employee {
    private String name;
    private int age;
    private String dept;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void print(){
        System.out.println("이름 : "+this.getName()+"\t\t나이 : "+this.getAge()+"\t부   서 : "+this.getDept());
    }
}
