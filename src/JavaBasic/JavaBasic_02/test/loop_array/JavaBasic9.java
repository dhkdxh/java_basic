package JavaBasic.JavaBasic_02.test.loop_array;
import java.util.*;

public class JavaBasic9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Student student = new Student();
        int numOfStudent  = 0;//학생수 input을 받기 위해 변수 선언

        Outter:
        while(true){
            System.out.println("--------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
            System.out.println("--------------------------------------------------");
            System.out.print("선택> ");

            try {
                int num = Integer.parseInt(sc.nextLine());//nextline으로 받음 -> string

                switch (num) {
                    case 1:
                        System.out.print("학생수> ");
                        numOfStudent = Integer.parseInt(sc.nextLine());
                        student = new Student(numOfStudent);//parameter가 있는 constructor를 이용하여 할당
                        break;
                    case 2:
                        if (!student.isStudentExisted()) {//학생 수를 입력하지 않았을 경우
                            System.out.println("아직 학생 수가 입력되지 않았습니다. 학생 수를 먼저 입력해주세요.");
                        } else {
                            for (int i = 0; i < numOfStudent; i++) {
                                System.out.printf("scores[%d]> ", i);
                                int score = Integer.parseInt(sc.nextLine());

                                if (score < 0 || score > 100) {//점수의 범위를 벗어난 경우
                                    System.out.println("점수의 범위를 벗어났습니다. 다시 입력해주세요.");
                                    i--;
                                    continue;
                                }
                                student.setScore(i, score);
                            }
                        }
                        break;
                    case 3:
                        if (!student.isScoreEntered()) {//score이 입력되지 않은 경우
                            System.out.println("입력된 학생이 없습니다. 학생 점수를 먼저 입력해주세요.");
                        } else {
                            for (int i = 0; i < numOfStudent; i++) {
                                System.out.printf("scores[%d]: %d\n", i, student.getScore(i));
                            }
                        }
                        break;
                    case 4:
                        if (!student.isScoreEntered()) {//score이 입력되지 않은 경우
                            System.out.println("입력된 학생이 없습니다. 학생 점수를 먼저 입력해주세요.");
                        } else {
                            System.out.printf("최고 점수: %d\n", student.getHighScore());
                            System.out.printf("평균 점수: %.1f\n", student.getAvg());
                        }
                        break;
                    case 5:
                        System.out.println("프로그램 종료");
                        break Outter;//switch문을 포함한 while문까지 벗어남
                    default:
                        System.out.println("숫자를 잘못 입력하셨습니다. 1-5까지의 숫자를 입력해주세요.");

                }
            } catch (Exception e) {//예외처리 한번에 다 받음
                System.out.println("예외가 발생하였습니다.");
            }
        }
    }
}
