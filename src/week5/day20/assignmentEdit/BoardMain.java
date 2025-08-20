package week5.day20.assignmentEdit;

public class BoardMain {

    public static void main(String[] args){
        BoardManager boardManager = BoardManager.getInstance();
        BoardExample boards = new BoardExample(boardManager);

        boards.run();
    }

}
