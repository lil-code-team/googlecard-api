package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.interfaces.annotations.ChatExclusive;
import lombok.Builder;

@Builder
public record TextParagraph(
    String text,
    @ChatExclusive
    Integer maxLines
) {  }
