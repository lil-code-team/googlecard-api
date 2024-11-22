package dev.lilcode.googlecard.v1.validators;

import dev.lilcode.googlecard.v1.types.Card;
import dev.lilcode.googlecard.v1.types.CardAction;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class GoogleChatWebhookValidationTest {

    @Test
    void validate_shouldNotThrowException() {
        // Given
        Card card = Card.builder().build();
        // When
        GoogleChatWebhookValidation googleChatWebhookValidation = new GoogleChatWebhookValidation();
        // Then
        assertDoesNotThrow(() -> googleChatWebhookValidation.validate(card));
    }

    @Test
    void validate_shouldThrowException() {
        // Given
        Card card = Card.builder().cardActions(new ArrayList<>(List.of(CardAction.builder().build()))).build();
        // When
        GoogleChatWebhookValidation googleChatWebhookValidation = new GoogleChatWebhookValidation();
        // Then
        assertDoesNotThrow(() -> googleChatWebhookValidation.validate(card));
    }
}