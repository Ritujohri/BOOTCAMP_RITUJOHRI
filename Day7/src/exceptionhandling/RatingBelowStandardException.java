package exceptionhandling;

/**
 * Created by johrir on 7/26/2017.
 */
public class RatingBelowStandardException extends Exception {
    public RatingBelowStandardException() {
    }

    public RatingBelowStandardException(String message) {
        super(message);
    }
}
