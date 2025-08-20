package week5.day20.assignmentEdit;

public class BoardException extends RuntimeException{
    private final ErrorCode error;

    public BoardException(ErrorCode error) {
        super(error.getMsg());
        this.error = error;
    }
}
