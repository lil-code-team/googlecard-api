package dev.lilcode.googlecard.v2.types;

import lombok.Builder;

@Builder
public record Image(
    String imageUrl,
    String altText,
    OnClick onClick
) {  }
