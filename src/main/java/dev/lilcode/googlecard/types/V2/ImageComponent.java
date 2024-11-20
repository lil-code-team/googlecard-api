package dev.lilcode.googlecard.types.V2;

import lombok.Builder;

@Builder
public record ImageComponent(
    String imageUri,
    String altText,
    ImageCropStyle imageCropStyle,
    BorderStyle borderStyle
) {  }
