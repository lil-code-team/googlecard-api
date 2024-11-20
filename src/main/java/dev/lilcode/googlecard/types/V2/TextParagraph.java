package dev.lilcode.googlecard.types.V2;

import dev.lilcode.googlecard.interfaces.ChatExclusive;
import lombok.Builder;

@Builder
public record TextParagraph(
    String text,
    @ChatExclusive
    Integer maxLines
) {  }
