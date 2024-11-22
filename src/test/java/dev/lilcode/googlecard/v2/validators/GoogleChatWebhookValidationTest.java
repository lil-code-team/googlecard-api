package dev.lilcode.googlecard.v2.validators;

import dev.lilcode.googlecard.exception.FieldNotUsableForApplicationException;
import dev.lilcode.googlecard.v2.types.Card;
import dev.lilcode.googlecard.v2.types.Section;
import dev.lilcode.googlecard.v2.types.TextInput;
import dev.lilcode.googlecard.v2.types.Widget;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GoogleChatWebhookValidationTest {

        @Test
        void validate_shouldNotThrowException() {
            // given
            Card card = Card.builder().build();
            // when
            GoogleChatWebhookValidation googleChatWebhookValidation = new GoogleChatWebhookValidation();
            // then
            assertDoesNotThrow(() -> googleChatWebhookValidation.validate(card));
        }

        @Test
        void validate_shouldThrowException1() {
            // given
            Card card = Card.builder().name("").peekCardHeader(Card.CardHeader.builder().build()).build();
            // when
            GoogleChatWebhookValidation googleChatWebhookValidation = new GoogleChatWebhookValidation();
            // then
            assertThrows(FieldNotUsableForApplicationException.class, () -> googleChatWebhookValidation.validate(card));
        }

        @Test
        void validate_shouldThrowException2() {
            // given
            Card card = Card.builder().sections(new ArrayList<>(List.of(
                Section.builder().widgets(new ArrayList<>(List.of(
                    Widget.builder().textInput(TextInput.builder().build()).build()
                ))).build()
            ))).build();
            // when
            GoogleChatWebhookValidation googleChatWebhookValidation = new GoogleChatWebhookValidation();
            // then
            assertThrows(FieldNotUsableForApplicationException.class, () -> googleChatWebhookValidation.validate(card));
        }
}