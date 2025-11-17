package exceptions;

public class RocketNotAvailableException extends RuntimeException {
    public RocketNotAvailableException(String message) {
        super(message);
    }
}
