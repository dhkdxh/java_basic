package week5.day20.assignmentEdit;

//사용자가 현재 게시물 목록을 읽을 수 있음
//사용자가 메뉴를 선택하여 글을 생성, 생성한 글을 읽고, 삭제 가능
//사용자는 게시판 프로그램을 종료할 수 있음

import java.text.SimpleDateFormat;
import java.util.*;

public class BoardExample {
    private static ValidCheck validCheck = new ValidCheck();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static int size = 1;
    BoardManager boardManager;

    public BoardExample(BoardManager boardManager) {
        this.boardManager = boardManager;
    }


    public void run() {
        while (true) {
            list(); //게시물 출력 + 메인 메뉴 선택 문구
            Scanner input = new Scanner(System.in);
            String menuNum = input.nextLine();
            try {
                validCheck.isMenuValid(menuNum);
                switch (menuNum) {
                    case "1" -> create();
                    case "2" -> read();
                    case "3" -> clear();
                    case "4" -> System.exit(0);
                }
            } catch (BoardException e) {
                System.out.println(e.getMessage());
                run();
            }
        }
    }


    public void create() throws BoardException {
        Scanner input = new Scanner(System.in);
        System.out.println(BoardText.CREATE.getText());
        System.out.print(BoardText.TITLE.getText());
        String title = input.nextLine();
        System.out.print(BoardText.BOARD.getText());
        String content = input.nextLine();
        System.out.print(BoardText.WRITER.getText());
        String writer = input.nextLine();
        if (checkMenu()) {
            Board board = Board.builder()
                    .bno(size)
                    .writer(writer)
                    .title(title)
                    .content(content)
                    .date(new Date())
                    .build();
            Map<String, Board> boardMap = boardManager.getBoardMap();
            boardMap.put(String.valueOf(size), board);
            boardManager.setBoardMap(boardMap);
            size++;
        }
    }


    public boolean checkMenu() throws BoardException {
        Scanner input = new Scanner(System.in);
        System.out.println(BoardText.CHECK_MENU.getText());
        System.out.print(BoardText.MENU_SELECT.getText());
        while (true) {
            String inputNumber = input.nextLine();
            validCheck.isCheckMenuValid(inputNumber);
            return inputNumber.equals("1"); //입력값이 1이면 true, 2이면 false
        }
    }

    public void read() throws BoardException {
        Scanner input = new Scanner(System.in);
        System.out.println(BoardText.READ.getText());
        System.out.print(BoardText.READ_NUMBER.getText());
        String number = input.nextLine();
        validCheck.isValidBoardNumber(number, boardManager.getBoardSize());

        Map<String, Board> boardMap = boardManager.getBoardMap();
        System.out.println(BoardText.READ_LINE.getText());
        Board board = boardMap.get(number);

        System.out.println(BoardText.BNO.getText() + board.getBno());
        System.out.println(BoardText.TITLE.getText() + board.getTitle());
        System.out.println(BoardText.BOARD.getText() + board.getContent());
        System.out.println(BoardText.WRITER.getText() + board.getWriter());
        System.out.println(BoardText.DATE.getText() + dateFormat.format(board.getDate()));
        System.out.println(BoardText.READ_LINE.getText());
        readOption(Integer.parseInt(number));
    }


    public void readOption(int bno) throws BoardException{
        Scanner input = new Scanner(System.in);
        System.out.println(BoardText.READ_CHECK_MENU.getText());
        System.out.print(BoardText.MENU_SELECT.getText());
        String numberInput = input.nextLine();
        validCheck.isReadOptionMenuValid(numberInput);
        switch(numberInput) {
            case "1" -> update(bno);
            case "2" -> delete(bno);
            case "3" -> run();
        }
    }


    public void update(int bno) throws BoardException{
        Scanner input = new Scanner(System.in);
        Map<String, Board> boardMap = boardManager.getBoardMap();
        System.out.println(BoardText.UPDATE.getText());
        System.out.print(BoardText.TITLE.getText());
        String title = input.nextLine();
        System.out.print(BoardText.BOARD.getText());
        String content = input.nextLine();
        System.out.print(BoardText.WRITER.getText());
        String writer = input.nextLine();
        System.out.println(BoardText.BORDER_LINE.getText());

        Board board = Board.builder()
                .title(title)
                .content(content)
                .writer(writer)
                .date(new Date())
                .build();

        if (checkMenu()) {
            boardMap.replace(String.valueOf(bno), board);
            boardMap.get(String.valueOf(bno)).setBno(bno);
            boardManager.setBoardMap(boardMap);
        }
    }


    public void delete(int bno) {
        int num = 1;
        size--;
        Map<String, Board> boardMap = boardManager.getBoardMap();
        Map<String, Board> newBoardMap = new LinkedHashMap<>();
        for (Map.Entry<String, Board> entry : boardMap.entrySet()) {
            String key = entry.getKey();
            Board board = entry.getValue();
            if (key.equals(String.valueOf(bno))) {
                continue;
            } else if (Integer.parseInt(key) < bno) {
                newBoardMap.put(key, board);
                num++;
            } else {
                newBoardMap.put(String.valueOf(num), board);
                board.setBno(num);
                num++;
            }
        }
        boardManager.setBoardMap(newBoardMap);
    }


    public void clear() {
        boardManager.getBoardMap().clear();
        boardManager.setBoardMap(new LinkedHashMap<>());
        size = 1;
    }

    public void list() {
        Map<String, Board> boardMap = boardManager.getBoardMap();
        System.out.println(BoardText.HEADER.getText());
        System.out.println(BoardText.BORDER_LINE.getText());
        System.out.printf("%-4s %-20s %-20s %-20s\n", "no", "writer", "date", "title");

        List<Map.Entry<String, Board>> entryList = new LinkedList<>(boardMap.entrySet());
        Collections.reverse(entryList);

        entryList.forEach(entry -> {
            Board value = entry.getValue();
            System.out.printf("%-4d %-20s %-20s %-20s\n", value.getBno(), value.getWriter(), dateFormat.format(value.getDate()), value.getTitle());
        });
        System.out.println(BoardText.BORDER_LINE.getText());

        mainMenu();
    }

    public void mainMenu() {
        System.out.println(BoardText.MAIN_MENU.getText());
        System.out.print(BoardText.MENU_SELECT.getText());
    }
}
