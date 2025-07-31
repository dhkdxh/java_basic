package day08;

public class Main {
    public static void main(String[] args) {
        MemberTest mt = new MemberTest();

        System.out.println(mt.getName("홍길동"));
        System.out.println(mt.getAge(30));
        System.out.println(mt.getPhone("010-1111-1111"));
        System.out.println(mt.getEmail("fc@naver.com"));
        System.out.println(mt.getPlace("서울"));
        System.out.println(mt.getWeight(57.6));

        System.out.println("--------------------------------------");

        MovieTest mv = new MovieTest();
        mv.name = "아바타";
        System.out.println(mv.name);
        mv.date = "2022.12.14";
        System.out.println(mv.date);
        mv.mainPerson = "제이크 설리";
        System.out.println(mv.mainPerson);
        mv.section = "액션";
        System.out.println(mv.section);
        mv.runningTime = 192;
        System.out.println(mv.runningTime);
        mv.grade = "12세";
        System.out.println(mv.grade);

        System.out.println("-------------------------");

        MovieTest[] list  = new MovieTest[3];
        for(int i=0; i<3; i++){
            list[i] = new MovieTest();
        }
        list[0].name = "아바타";
        list[1].name = "아티";
        list[2].name = "좀비딸";

        for (MovieTest movieTest : list) {
            System.out.println(movieTest.name);
        }
    }
}
