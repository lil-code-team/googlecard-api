package dev.lilcode.googlecard.types.V1;

import lombok.Builder;

/**
 * @deprecated Use {@link dev.lilcode.googlecard.types.V2.Image} instead
 */
@Deprecated()
@Builder
public record Image(
    String imageUrl,
    OnClick onClick,
    Number aspectRatio
) {  }
