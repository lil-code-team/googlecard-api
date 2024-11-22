package dev.lilcode.googlecard.validations;

import dev.lilcode.googlecard.exception.FieldNotUsableForApplicationException;
import dev.lilcode.googlecard.interfaces.annotations.ChatApplicationExclusive;
import dev.lilcode.googlecard.interfaces.annotations.Validate;
import lombok.AllArgsConstructor;

import java.util.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

@AllArgsConstructor
public class FieldsValidationNotExistAnnotation<T> extends Validator<T> {
    private final Class<? extends Annotation> annotation;

    @Override
    public void validate(Object record) {
        if (record == null) return;
        for (Field field : record.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try {
                Object value = field.get(record);
                if(value == null) continue;
                if (value.getClass().isRecord() && value.getClass().isAnnotationPresent(Validate.class)) {
                        new FieldsValidationNotExistAnnotation<>(annotation).validate(value);
                }
                if(value instanceof List<?>) {
                    for (Object obj : (List<?>) value) {
                        if (obj.getClass().isRecord() && (obj.getClass().isAnnotationPresent(Validate.class) || isAnnotatedWithValidate(obj.getClass()))) {
                            new FieldsValidationNotExistAnnotation<>(annotation).validate(obj);
                        }
                    }
                }
                if (field.isAnnotationPresent(annotation) || field.getType().isAnnotationPresent(annotation)) {
                    throw new FieldNotUsableForApplicationException(field.getName(), annotation.getName());
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Error accessing field: " + field.getName(), e);
            }
        }
    }

        private boolean isAnnotatedWithValidate(Class<?> clazz) {
        for (Annotation ann : clazz.getAnnotations()) {
            if (ann.annotationType().isAnnotationPresent(Validate.class)) {
                return true;
            }
        }
        return false;
    }
}
