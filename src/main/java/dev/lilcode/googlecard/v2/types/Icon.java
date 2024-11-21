package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.v2.types.enums.ImageType;
import lombok.Builder;

@Builder
public record Icon(
    String altText,
    ImageType imageType,
    String knownIcon,
    String iconUrl,
    MaterialIcon materialIcon
) {  }
