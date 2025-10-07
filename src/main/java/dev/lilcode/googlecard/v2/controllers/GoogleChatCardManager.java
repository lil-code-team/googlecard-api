package dev.lilcode.googlecard.v2.controllers;

import dev.lilcode.googlecard.controllers.ClientGoogleChatWebhook;
import dev.lilcode.googlecard.exception.MessageDeliveryException;
import dev.lilcode.googlecard.types.TextMessage;
import dev.lilcode.googlecard.v2.types.Card;
import dev.lilcode.googlecard.v2.types.CardsV2;
import dev.lilcode.googlecard.v2.types.RequestCards;
import dev.lilcode.googlecard.v2.validators.GoogleChatWebhookValidation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public class GoogleChatCardManager {
    private final ClientGoogleChatWebhook client;
    private final ArrayList<CardsV2> cards = new ArrayList<>();
    private final GoogleChatWebhookValidation validator = new GoogleChatWebhookValidation();

    public GoogleChatCardManager(ClientGoogleChatWebhook client) {
        this.client = client;
    }

    public UUID addCard(Card card) {
        validator.validate(card);
        UUID cardId = UUID.randomUUID();
        cards.add(CardsV2.builder().cardId(cardId).card(card).build());
        return cardId;
    }
    public void removeCard(UUID cardId) {
        cards.removeIf(c -> c.cardId().equals(cardId));
    }

    public void send() {
        try {
            var result = client.googleChatWebhook.send(new RequestCards(cards), client.getSpaceId(), client.getKey(), client.getToken())
                .execute();
            if(!result.isSuccessful())
                throw new MessageDeliveryException(result.code(), result.message());
        } catch (IOException e) {
            throw new MessageDeliveryException("Error on send Cards", e);
        } finally {
            cards.clear();
        }
    }

    public void send(String message) {
        try {
            var result = client.googleChatWebhook.send(new TextMessage(message), client.getSpaceId(), client.getKey(), client.getToken())
                .execute();
            if(!result.isSuccessful())
                throw new MessageDeliveryException(result.code(), result.errorBody() != null ? result.errorBody().string() : null);
        } catch (IOException e) {
            throw new MessageDeliveryException("Error on send message text", e);
        }
    }
}
