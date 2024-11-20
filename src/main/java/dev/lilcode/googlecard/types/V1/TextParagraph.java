package dev.lilcode.googlecard.types.V1;

import lombok.Builder;

/**
 * @deprecated Use {@link dev.lilcode.googlecard.types.V2.TextParagraph} instead
 */
@Deprecated()
@Builder
public record TextParagraph(
    String text
) {  }
