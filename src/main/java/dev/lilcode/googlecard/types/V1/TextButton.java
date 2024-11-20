package dev.lilcode.googlecard.types.V1;

import lombok.Builder;

/**
 * @deprecated Use {@link dev.lilcode.googlecard.types.V2.Button} instead
 */
@Deprecated()
@Builder
public record TextButton(
    String text,
    OnClick onClick
) {  }
