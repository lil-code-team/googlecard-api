package dev.lilcode.googlecard.v2.types;

import lombok.Builder;

@Builder
public record ImageComponent(
    String imageUri,
    String altText,
    ImageCropStyle imageCropStyle,
    BorderStyle borderStyle
) {  }
