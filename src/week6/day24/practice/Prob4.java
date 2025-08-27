package week6.day24.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    private String owner;
    private transient int balance;

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeInt(this.balance);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        balance = in.readInt();
    }
}

public class Prob4 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("C:/temp/accounts.dat");
            ObjectOutputStream os = new ObjectOutputStream(fos)){

            Account a = new Account("철수", 10000);
            os.writeObject(a);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream("C:/temp/accounts.dat")) {
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                while (true) {
                    Object obj = ois.readObject();
                    if(obj instanceof Account){
                        Account account = (Account) obj;
                        System.out.println(account);
                    }
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
