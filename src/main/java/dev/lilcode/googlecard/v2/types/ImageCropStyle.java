package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.v2.types.enums.ImageCropType;
import lombok.Builder;

@Builder
public record ImageCropStyle(
    ImageCropType type,
    Number aspectRatio
) {  }
