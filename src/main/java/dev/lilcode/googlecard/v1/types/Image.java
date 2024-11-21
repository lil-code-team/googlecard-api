package dev.lilcode.googlecard.v1.types;

import lombok.Builder;

/**
 * @deprecated Use {@link dev.lilcode.googlecard.v2.types.Image} instead
 */
@Deprecated()
@Builder
public record Image(
    String imageUrl,
    OnClick onClick,
    Number aspectRatio
) {  }
