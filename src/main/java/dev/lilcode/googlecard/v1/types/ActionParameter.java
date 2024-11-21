package dev.lilcode.googlecard.v1.types;

import dev.lilcode.googlecard.v2.types.Action;
import lombok.Builder;

/**
 * @deprecated Use {@link Action} instead
 */
@Deprecated()
@Builder
public record ActionParameter(
    String key,
    String value
) {  }
