package week4.day17.assignment;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(){}

    public WrongPasswordException(String message) {
        super(message);
    }
}
