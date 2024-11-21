package dev.lilcode.googlecard.exception;

public class MessageDeliveryException extends RuntimeException {
    public MessageDeliveryException(int code, String body) {
        super("Failed to deliver message. Code: " + code + ", Body: " + body);
    }

    public MessageDeliveryException(String message, Throwable cause) {
        super(message, cause);
    }
}
