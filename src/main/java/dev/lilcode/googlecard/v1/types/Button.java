package dev.lilcode.googlecard.v1.types;

import lombok.Builder;

/**
 * @deprecated Use {@link dev.lilcode.googlecard.v2.types.Button} instead
 */
@Deprecated()
@Builder
public record Button(
    TextButton textButton,
    ImageButton imageButton
) {  }
