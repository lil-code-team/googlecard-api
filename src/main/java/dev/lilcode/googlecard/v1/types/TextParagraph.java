package dev.lilcode.googlecard.v1.types;

import lombok.Builder;

/**
 * @deprecated Use {@link dev.lilcode.googlecard.v2.types.TextParagraph} instead
 */
@Deprecated()
@Builder
public record TextParagraph(
    String text
) {  }