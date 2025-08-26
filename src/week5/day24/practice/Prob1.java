package week5.day24.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private transient int age;

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeInt(age);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        age = in.readInt();
    }
}

public class Prob1 {
    public static void main(String[] args) {
        Person p = new Person("홍길동", 30);

        Path path = Paths.get("person.dat");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(p);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(FileInputStream fis = new FileInputStream("C:/temp/person.dat")){
            try(ObjectInputStream ois = new ObjectInputStream(fis)) {
                //ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Path타입 변수));
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
