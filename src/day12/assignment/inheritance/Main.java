package day12.assignment.inheritance;

public class Main {
    public static void main(String[] args) {
        if(args.length<3){
            System.out.println("이름, 과정명, 교육비를 순서대로 입력해주세요.");
            return;
        }

        String name = args[0];
        String subject = args[1];
        int fee = Integer.parseInt(args[2]);

        Student student = new Student(name,subject,fee);

        student.calcReturnFee();
        student.print();
    }
}
