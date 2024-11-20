package dev.lilcode.googlecard.types.V2;

import dev.lilcode.googlecard.types.V2.enums.ImageCropType;
import lombok.Builder;

@Builder
public record ImageCropStyle(
    ImageCropType type,
    Number aspectRatio
) {  }
