package dev.lilcode.googlecard.v1.validators;

import dev.lilcode.googlecard.interfaces.annotations.ChatApplicationExclusive;
import dev.lilcode.googlecard.interfaces.annotations.WorkspaceExclusive;
import dev.lilcode.googlecard.v1.types.Card;
import dev.lilcode.googlecard.validations.Validator;

@Deprecated
public class GoogleChatWebhookValidation extends Validator<Card> {
    @Override
    public void validate(Card card) {
        notAnnotatedWith(card, ChatApplicationExclusive.class);
        notAnnotatedWith(card, WorkspaceExclusive.class);
    }
}
