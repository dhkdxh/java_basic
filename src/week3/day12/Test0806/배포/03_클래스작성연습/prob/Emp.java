public class Emp {
    private String id;
    private String name;
    private int baseSalary;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary(double bonus){
        return this.baseSalary+ this.baseSalary*bonus;
    }

    @Override
    public String toString() {
        return this.getName()+"("+this.getId()+") 사원의 기본급은 "+this.getBaseSalary()+"원 입니다.";
    }
}
