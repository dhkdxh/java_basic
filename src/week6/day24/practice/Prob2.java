package week6.day24.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.io.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Book implements Serializable{
    private static final long serialVersionUID = 1L;
    private String title;
    private int price;
}

public class Prob2 {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book("book1", 10000));
        list.add(new Book("book2", 20000));
        list.add(new Book("book3", 30000));

        try (FileOutputStream fos = new FileOutputStream("C:/temp/books.dat")) {
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(list);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream("C:/temp/books.dat")) {
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                while (true) {
                    Object obj = ois.readObject();
                    System.out.println(obj);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (EOFException e) {
            System.out.println("파일 끝");
        }catch (IOException e) {
            System.out.println();
        }
    }
}
