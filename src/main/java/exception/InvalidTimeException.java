package exception;

public class InvalidTimeException extends Exception {
    public InvalidTimeException() {
    }

    public InvalidTimeException(String message) {
        super(message);
    }

    public InvalidTimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidTimeException(Throwable cause) {
        super(cause);
    }
}
