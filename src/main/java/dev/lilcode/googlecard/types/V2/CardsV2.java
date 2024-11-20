package dev.lilcode.googlecard.types.V2;

import lombok.Builder;

import java.util.UUID;

@Builder
public record CardsV2(
    UUID cardId,
    Card card
) {  }
