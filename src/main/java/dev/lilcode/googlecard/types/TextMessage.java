package dev.lilcode.googlecard.types;

import dev.lilcode.googlecard.interfaces.ChatExclusive;
import lombok.Builder;

@ChatExclusive
@Builder
public record TextMessage(
    String text
) {  }