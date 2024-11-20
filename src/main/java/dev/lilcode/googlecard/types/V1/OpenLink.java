package dev.lilcode.googlecard.types.V1;

import lombok.Builder;

/**
 * @deprecated Use {@link dev.lilcode.googlecard.types.V2.OpenLink} instead
 */
@Deprecated()
@Builder
public record OpenLink(
    String url
) {  }
