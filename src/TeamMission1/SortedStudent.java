package TeamMission1;

import java.nio.file.*;
import java.util.*;
import java.io.*;

public class SortedStudent {
    static Map<String, Student> studentInfo;
    static File file;
    static Set<Student> students;


    public static void main(String[] args) {

    }

    public static void loadObjectFromFile() {
        Path path = Paths.get("C:/Temp/student.dat");

        if(!Files.exists(path)){
            System.out.println("[오류] 해당 파일이 존재하지 않습니다.");
            System.exit(0);
        }
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Object o = ois.readObject();
            studentInfo = (Map<String, Student>) o;

        } catch (ClassNotFoundException e) {
            System.out.println("[실패] "+ e.getMessage());
        } catch (IOException e) {
            System.out.println("[실패] "+ e.getMessage());
        }
    }

    public static void createTreeSet(){
        students = new TreeSet<>(new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if(s1.getAverage() > s2.getAverage()) return 1;
                else if(s1.getAverage() < s2.getAverage()) return -1;
                else{//평균이 같은 경우 이름 순..
                    if(s1.getName().compareTo(s2.getName()) > 0) return 1;
                    else if(s1.getName().compareTo(s2.getName()) < 0) return -1;
                    return 0;
                }
            }
        });
    }

    public static void printResult(){

    }

    public static void outputObject(){
        file = new File("C:/Temp/orderByAvg.dat");

        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException e){
                System.out.println("파일 생성 중 오류 발생: "+ e.getMessage());
            }
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
