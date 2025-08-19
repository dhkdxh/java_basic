package week5.day19.assignment;
import java.util.*;

public class BoardExample {
    static Scanner sc = new Scanner(System.in);
    List<Board> boards = new ArrayList<>();

    public static void list(){
        System.out.println("------------------------------------------");
        System.out.println("no\twriter  \tdate   \ttitle");
        System.out.println("1\twinter  \t2024.01.02   \t게시판에 오신 것을 환영합니다.");
        System.out.println("2\twinter  \t2024.01.01   \t올 겨울은 많이 춥습니다.");
        System.out.println();
        System.out.println("------------------------------------------");
    }

    public static void mainMenu(){
        System.out.println("메인메뉴: 1. Create | 2. Read | 3. Clear | 4. Exit");
        System.out.print("메뉴 선택: ");
        int input= Integer.parseInt(sc.nextLine());
        System.out.println();
        switch(input){
            case 1 -> create();
            case 2 -> read();
            case 3 -> Clear();
            case 4 -> System.exit(0);
        }
    }

    public static void create(){
        System.out.println("[새 개시물 입력]");
        System.out.println("제목: ");
        String title = sc.nextLine();
        System.out.println("내용: ");
        String content = sc.nextLine();
        System.out.println("작성자: ");
        String name = sc.nextLine();

        System.out.println("------------------------------------------");
        System.out.println("보조 메뉴 : 1. OK | 2. Cancel");
        System.out.print("메뉴 선택: ");
        int input= Integer.parseInt(sc.nextLine());

        switch (input){
            case 1 -> createBoard(title, content, name);
        }
    }

    public static void createBoard(String title, ){
        Board board = new Board();
    }

}
