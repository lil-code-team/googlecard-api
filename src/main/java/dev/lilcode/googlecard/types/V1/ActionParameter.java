package dev.lilcode.googlecard.types.V1;

import lombok.Builder;

/**
 * @deprecated Use {@link dev.lilcode.googlecard.types.V2.Action} instead
 */
@Deprecated()
@Builder
public record ActionParameter(
    String key,
    String value
) {  }
