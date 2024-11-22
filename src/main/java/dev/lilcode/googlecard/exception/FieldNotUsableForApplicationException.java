package dev.lilcode.googlecard.exception;

public class FieldNotUsableForApplicationException extends RuntimeException {
    public FieldNotUsableForApplicationException(String fieldName, String annotation) {
        super("Field '" + fieldName + "' cannot be used for the application as it is:: " + annotation);
    }
}
