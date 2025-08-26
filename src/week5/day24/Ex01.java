package week5.day24;
//자바는 메모리에 생성된 객체를 파일 또는 네트워크로 출력할 수 있음
//ObjectInputStream -> 바이트 스트림과 연결되어 객체로 복원하는 역직렬화
// ObjectOutputStream -> 바이트 스트림과 연결되어 객체를 직렬화

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.*;

@NoArgsConstructor
@Data
@AllArgsConstructor
class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int price;
}

public class Ex01 {
    public static void main(String[] args) throws Exception{
        //C:/Temp/Object.dat에 파일 객체에 파일 입력 스트림 객체를 생성
        FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");

        ObjectOutputStream oos  = new ObjectOutputStream(fos);

        //직렬화할 객체 생성
        User user = new User("신세계", 20);
        Product product= new Product("삼성 노트북", 1500000);
        int[] arr1 = {10,20,30};
        List<Product> products = Arrays.asList(product);

        //위 객체를 object.dat 파일에 저장하기
        oos.writeObject(products);
        oos.writeObject(arr1);
        oos.writeObject(product);
        oos.writeObject(user);

        oos.flush();
        oos.close();
        fos.flush();
        fos.close();

        FileInputStream is = new FileInputStream("C:/Temp/Object.dat");
        ObjectInputStream ois = new ObjectInputStream(is);

        try{
            while(true){
                Object Obj = ois.readObject();
                System.out.println(Obj);
            }
        }catch(EOFException e){
            System.out.println("파일 끝");
        }finally{
            ois.close();
            is.close();
        }

    }
}
