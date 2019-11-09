package co.com.devco.exceptions;

public class NoChannelSubscribeException extends AssertionError {
    public static final String NO_CHANNEL_SUBSCRIBE = "You are not subscribe to any channel yet";

    public NoChannelSubscribeException(String mensaje, Throwable causa){
        super(mensaje,causa);
    }
}
