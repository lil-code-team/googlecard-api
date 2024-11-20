package dev.lilcode.googlecard.types.V2;

import dev.lilcode.googlecard.types.V2.enums.Type;
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
