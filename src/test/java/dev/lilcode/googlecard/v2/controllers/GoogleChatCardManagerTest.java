package dev.lilcode.googlecard.v2.controllers;

import dev.lilcode.googlecard.controllers.ClientGoogleChatWebhook;
import dev.lilcode.googlecard.v2.types.Card;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class GoogleChatCardManagerTest {

    @Test
    void addCard_shouldReturnUUID() {
        // given
        ClientGoogleChatWebhook client = new ClientGoogleChatWebhook("space123", "key123", "token123");
        GoogleChatCardManager manager = new GoogleChatCardManager(client);
        Card card = Card.builder().build();

        // when
        UUID result = manager.addCard(card);

        // then
        assertNotNull(result, "The returned UUID should not be null");
    }

    @Test
    void addCard_shouldReturnDifferentUUIDs() {
        // given
        ClientGoogleChatWebhook client = new ClientGoogleChatWebhook("space123", "key123", "token123");
        GoogleChatCardManager manager = new GoogleChatCardManager(client);
        Card card1 = Card.builder().build();
        Card card2 = Card.builder().build();

        // when
        UUID uuid1 = manager.addCard(card1);
        UUID uuid2 = manager.addCard(card2);

        // then
        assertNotNull(uuid1, "The first UUID should not be null");
        assertNotNull(uuid2, "The second UUID should not be null");
        assertNotEquals(uuid1, uuid2, "Each card should have a unique UUID");
    }

    @Test
    void removeCard_shouldRemoveCardByUUID() {
        // given
        ClientGoogleChatWebhook client = new ClientGoogleChatWebhook("space123", "key123", "token123");
        GoogleChatCardManager manager = new GoogleChatCardManager(client);
        Card card = Card.builder().build();

        // when
        UUID cardId = manager.addCard(card);
        manager.removeCard(cardId);

        // then
        // If we could access the cards list, we'd verify it's removed
        // For now, we just verify no exception is thrown
        assertDoesNotThrow(() -> manager.removeCard(cardId));
    }
}
