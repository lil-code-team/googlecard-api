package dev.lilcode.googlecard.validations;

import java.lang.annotation.Annotation;

public abstract class Validator<T> {
    public abstract void validate(T obj);
    public void validate(T obj, Validator<T> validator) {
        validator.validate(obj);
    }

    public void notAnnotatedWith(T obj, Class<? extends Annotation> annotation) {
        new FieldsValidationNotExistAnnotation<>(annotation).validate(obj);
    }
}
