package week5.day20.assignmentEdit;

import java.util.*;

public class BoardManager {
    private Map<String, Board> boardMap = new LinkedHashMap<>();

    //singleton pattern -> admin 계정은 하나임. 이 계정은 게시글 저장소 관리
    private static BoardManager boardManagerSingleton = new BoardManager();

    public static BoardManager getInstance(){
        return boardManagerSingleton;
    }

    public Map<String, Board> getBoardMap() {
        return boardMap;
    }

    public void setBoardMap(Map<String, Board> boardMap) {
        this.boardMap = boardMap;
    }

    public int getBoardSize() {
        return boardMap.size();
    }
}
