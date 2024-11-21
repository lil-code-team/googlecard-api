package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.v2.types.enums.Type;
import lombok.Builder;

@Builder
public record Button(
    String text,
    Icon icon,
    Color color,
    OnClick onClick,
    Boolean disabled,
    String altText,
    Type type
) {  }
