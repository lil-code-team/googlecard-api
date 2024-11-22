package dev.lilcode.googlecard.types;

import dev.lilcode.googlecard.interfaces.annotations.ChatExclusive;
import lombok.Builder;

@ChatExclusive
@Builder
public record TextMessage(
    String text
) {  }