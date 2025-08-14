package week3.day14.assignment.num1;

public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Dog(8);
        Animal chicken = new Chicken(3);
        Chicken cheatableChicken = new Chicken(5);
        //animal type에서는 fly 호출할 수 없기 때문에

//        Cheatable current = cheatableChicken;
//        current.fly();

        if(cheatableChicken instanceof Cheatable) cheatableChicken.fly();

        for(int i=1; i<=3; i++){
            System.out.println(i+"시간 후");

            dog.run(1);
            chicken.run(1);
            System.out.print("날으는 ");
            cheatableChicken.run(1);
        }
    }
}
