package dev.lilcode.googlecard.types.V2;

import dev.lilcode.googlecard.types.V2.enums.ImageType;
import lombok.Builder;

@Builder
public record Icon(
    String altText,
    ImageType imageType,
    String knownIcon,
    String iconUrl,
    MaterialIcon materialIcon
) {  }
