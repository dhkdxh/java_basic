package TeamMission1;

import java.util.*;
import java.io.*;

public class StudentInput {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        File file = new File("C:/Temp/student.dat");


        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            Map<String, Student> studentInfo = new HashMap<>();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printUsage(){
        System.out.println("[학생 성적 입력 프로그램]");
        System.out.println("- 종료하려면 이름에 ^^를 입력하세요.");
        System.out.println("- 점수는 0~100 사이의 정수만 허용됩니다.");
        System.out.println();
    }

    public static void userInput(Map<String, Student> map){
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("국어: ");
        int subject1 = Integer.parseInt(sc.nextLine());
        System.out.print("영어: ");
        int subject2 = Integer.parseInt(sc.nextLine());
        System.out.print("수학: ");
        int subject3 = Integer.parseInt(sc.nextLine());
        System.out.print("과학: ");
        int subject4 = Integer.parseInt(sc.nextLine());


    }


}
