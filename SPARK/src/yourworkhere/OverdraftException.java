package yourworkhere;

public class OverdraftException extends RuntimeException {
    public OverdraftException(String message) {
        super(message);
    }
}