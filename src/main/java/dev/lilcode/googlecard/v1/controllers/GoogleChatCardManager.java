package dev.lilcode.googlecard.v1.controllers;


import dev.lilcode.googlecard.controllers.ClientGoogleChatWebhook;
import dev.lilcode.googlecard.exception.MessageDeliveryException;
import dev.lilcode.googlecard.types.TextMessage;
import dev.lilcode.googlecard.v1.types.Card;
import dev.lilcode.googlecard.v1.validators.GoogleChatWebhookValidation;

import java.io.IOException;

/**
 * @deprecated Use {@link dev.lilcode.googlecard.v2.controllers.GoogleChatCardManager} instead.
 */
@Deprecated
public class GoogleChatCardManager {
    private final ClientGoogleChatWebhook client;
    private final GoogleChatWebhookValidation validator = new GoogleChatWebhookValidation();

    public GoogleChatCardManager(ClientGoogleChatWebhook client) {
        this.client = client;
    }

    public void send(Card card) {
        validator.validate(card);
        try {
            var result = client.googleChatWebhook.send(card, client.getSpaceId(), client.getKey(), client.getToken())
                .execute();
            if(!result.isSuccessful())
                throw new MessageDeliveryException(result.code(), result.message());
        } catch (IOException e) {
            throw new MessageDeliveryException("Error on send Card", e);
        }
    }

    public void send(String message) {
        try {
            var result = client.googleChatWebhook.send(new TextMessage(message), client.getSpaceId(), client.getKey(), client.getToken()).execute();
            if(!result.isSuccessful())
                throw new MessageDeliveryException(result.code(), result.errorBody().string());
        } catch (IOException e) {
            throw new MessageDeliveryException("Error on send message text", e);
        }
    }
}
