package co.com.devco.exceptions;

public class VideoDoesNotBelongToTheBandException extends AssertionError {
    public static final String OTHER_VIDEO_LISTED_MESSAGE = "The video listed does not belongs to the Band that you expected";

    public VideoDoesNotBelongToTheBandException(String message, Throwable cause){
        super(message, cause);
    }
}
