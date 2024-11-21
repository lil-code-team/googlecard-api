package dev.lilcode.googlecard.controllers;

import dev.lilcode.googlecard.clients.GoogleChatWebhook;
import dev.lilcode.googlecard.constants.Uri;
import lombok.Getter;

public class ClientGoogleChatWebhook {
    public final GoogleChatWebhook googleChatWebhook;
    @Getter
    private final String spaceId;
    @Getter
    private final String key;
    @Getter
    private final String token;

    public ClientGoogleChatWebhook(String spaceId, String key, String token) {
        this.googleChatWebhook = GoogleChatWebhook.create(Uri.GOOGLE_CHAT);
        this.spaceId = spaceId;
        this.key = key;
        this.token = token;
    }

    public ClientGoogleChatWebhook(String webhookUrl) {
        this.googleChatWebhook = GoogleChatWebhook.create(Uri.GOOGLE_CHAT);
        var split = webhookUrl.split("/");
        this.spaceId = split[5];
        this.key = split[6].substring(split[6].indexOf("key=")+4, split[6].indexOf("&token="));
        this.token = split[6].substring(split[6].indexOf("&token=")+7);
    }
}
