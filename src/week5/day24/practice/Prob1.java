package week5.day24.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.io.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private transient int age;
}

public class Prob1 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("C:/temp/person.dat")){
            try(ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                Person p = new Person("홍길동", 30);
                oos.writeObject(p);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(FileInputStream fis = new FileInputStream("C:/temp/person.dat")){
            try(ObjectInputStream ois = new ObjectInputStream(fis)) {
                while(true){
                    Object obj = ois.readObject();
                    System.out.println(obj);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch(EOFException e) {
            System.out.println("파일의 끝");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
