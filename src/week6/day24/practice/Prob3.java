package week6.day24.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Student implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private int grade;
}

public class Prob3 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("C:/temp/students.dat");
            ObjectOutputStream os = new ObjectOutputStream(fos)){

            os.writeObject(new Student("yewon1", 90));
            os.writeObject(new Student("yewon2", 80));

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(FileInputStream fis = new FileInputStream("C:/temp/students.dat");
            ObjectInputStream is = new ObjectInputStream(fis)){

            while(true){
                Object obj = is.readObject();
                System.out.println(obj);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (EOFException e){
            System.out.println("파일 끝");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
