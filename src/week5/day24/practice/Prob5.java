package week5.day24.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.io.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Product implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private int price;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Order implements Serializable{
    private static final long serialVersionUID = 2L;
    private int orderId;
    private Product product;
}

public class Prob5 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("C:/temp/orders.dat");
            ObjectOutputStream os = new ObjectOutputStream(fos)){
            Order order = new Order(10, new Product("pro1", 10000));
            os.writeObject(order);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(FileInputStream fis = new FileInputStream("C:/temp/orders.dat");
            ObjectInputStream is = new ObjectInputStream(fis)){

            while(true){
                Object obj = is.readObject();
                System.out.println(obj);
                if(obj instanceof Order){//정보 한번 더 출력..
                    Order order = (Order) obj;
                    System.out.println(order.getProduct());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch(EOFException e) {
            System.out.println("파일 끝");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
