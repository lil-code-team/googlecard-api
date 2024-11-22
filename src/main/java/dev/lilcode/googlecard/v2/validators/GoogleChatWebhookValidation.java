package dev.lilcode.googlecard.v2.validators;

import dev.lilcode.googlecard.interfaces.annotations.ChatApplicationExclusive;
import dev.lilcode.googlecard.interfaces.annotations.WorkspaceExclusive;
import dev.lilcode.googlecard.v2.types.Card;
import dev.lilcode.googlecard.validations.Validator;

public class GoogleChatWebhookValidation extends Validator<Card> {
    @Override
    public void validate(Card card) {
        notAnnotatedWith(card, ChatApplicationExclusive.class);
        notAnnotatedWith(card, WorkspaceExclusive.class);
    }
}
