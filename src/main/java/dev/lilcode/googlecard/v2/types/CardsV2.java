package dev.lilcode.googlecard.v2.types;

import lombok.Builder;

import java.util.UUID;

@Builder
public record CardsV2(
    UUID cardId,
    Card card
) {  }
