package exceptions;

public class RocketAlreadyAssignedException extends RuntimeException {
    public RocketAlreadyAssignedException(String message) {
        super(message);
    }
}
