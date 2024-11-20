package dev.lilcode.googlecard.types.V2;

import lombok.Builder;

@Builder
public record Image(
    String imageUrl,
    String altText,
    OnClick onClick
) {  }
