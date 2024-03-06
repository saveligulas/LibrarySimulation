package exception;

public class ObjectDoesNotExistException extends Exception {
    public ObjectDoesNotExistException() {
    }

    public ObjectDoesNotExistException(String message) {
        super(message);
    }

    public ObjectDoesNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public ObjectDoesNotExistException(Throwable cause) {
        super(cause);
    }
}
