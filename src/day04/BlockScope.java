package day04;
import java.util.*;

public class BlockScope {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("name: ");
        String name = sc.nextLine();

        callName(name);
    }

    private static void callName(String name) {
        System.out.println("나의 이름은: "+name);
    }
}
