package week5.day19.assignment;
import java.util.*;

public class BoardExample {
    static Scanner sc = new Scanner(System.in);
    static List<Board> boards = new ArrayList<>();
    static int boardCount = 1;

    public static void main(String[] args) {
        try {
            while(true){
                list();
                mainMenu();
            }
        } catch (BoardException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void mainMenu() throws BoardException{
        System.out.println("------------------------------------------");
        System.out.println("메인메뉴: 1. Create | 2. Read | 3. Clear | 4. Exit");
        System.out.print("메뉴 선택: ");
        int input= Integer.parseInt(sc.nextLine());
        System.out.println();
        switch(input){
            case 1 -> create();
            case 2 -> read();
            case 3 -> clear();
            case 4 -> {
                System.out.println("** 게시판 종료 **");
                System.exit(0);
            }
            default -> throw new BoardException("1-4까지의 숫자를 입력해주세요.");
        }
    }

    public static void create() throws BoardException{
        System.out.println("[새 개시물 입력]");
        System.out.print("제목: ");
        String title = sc.nextLine();
        System.out.print("내용: ");
        String content = sc.nextLine();
        System.out.print("작성자: ");
        String name = sc.nextLine();

        System.out.println("------------------------------------------");
        System.out.println("보조 메뉴 : 1. OK | 2. Cancel");
        System.out.print("메뉴 선택: ");
        int input= Integer.parseInt(sc.nextLine());
        System.out.println();

        switch (input){
            case 1: createBoard(title, content, name); break;
            case 2: break;
            default: throw new BoardException("1-2까지의 숫자만 입력해주세요.");
        }
    }

    public static void createBoard(String title, String content, String name){
        Board board = new Board(boardCount,title, content, name);
        boards.add(board);
        boardCount++;
        list();
    }

    public static void read() throws BoardException{
        System.out.println("[게시물 읽기]");
        System.out.print("bno: ");
        int input = Integer.parseInt(sc.nextLine());
        if(input <=0 || input > boardCount){
            throw new BoardException("해당 번호에 해당하는 책이 존재하지 않습니다.");
        }
        boards.get(input-1).readBoard();
        subMenu1(input);
    }

    public static void subMenu1(int num) throws BoardException{
        System.out.println("------------------------------------------");
        System.out.println("보조메뉴: 1.Update | 2.Delete | 3.List");
        System.out.print("메뉴 선택: ");
        int input = Integer.parseInt(sc.nextLine());
        System.out.println();

        switch(input){
            case 1 -> update(num);
            case 2 -> delete(num);
            case 3 -> list();
            default -> throw new BoardException("1-3까지의 숫자를 입력해주세요.");
        }
    }

    public static void update(int num) throws BoardException{
        System.out.println("[수정 내용 입력]");
        System.out.print("제목: ");
        String reTitle = sc.nextLine();
        System.out.print("내용: ");
        String reContent = sc.nextLine();
        System.out.print("작성자: ");
        String reWriter = sc.nextLine();

        System.out.println("------------------------------------------");
        System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
        System.out.print("메뉴 선택: ");
        int input = Integer.parseInt(sc.nextLine());

        if(input != 1 && input != 2){
            throw new BoardException("1-2까지의 숫자만 입력해주세요.");
        }
        if(input == 1){
            boards.get(num-1).setbTitle(reTitle);
            boards.get(num-1).setbContent(reContent);
            boards.get(num-1).setBwriter(reWriter);
        }
        list();
    }

    public static void list(){
        System.out.println("[게시물 목록]");
        System.out.println("------------------------------------------");
        System.out.println("no\twriter \tdate  \t\ttitle");
        System.out.println("------------------------------------------");
        for(int i =boards.size()-1; i>=0; i--){
            boards.get(i).printBoard();
        }
        System.out.println();
    }

    public static void delete(int num){
        boards.remove(num-1);
        list();
    }

    public static void clear() throws BoardException{
        System.out.println("[게시물 전체 삭제]");
        System.out.println("------------------------------------------");
        System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
        System.out.print("메뉴 선택: ");
        int input = Integer.parseInt(sc.nextLine());
        System.out.println();
        if(input != 1 && input != 2) throw new BoardException("1-2까지의 숫자만 입력해주세요.");

        boards.clear();
        boards = new ArrayList<>();
        list();
    }
}
