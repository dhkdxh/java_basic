package BookMarket.member;

public class Admin extends Person{
    private String id = "Admin";
    private String password = "Admin1234";

    public Admin(String name, int phone){
        super(name,phone);
    }

    public String getId(){
        return this.id;
    }

    public String getPassword(){
        return this.password;
    }
}
