package dev.lilcode.googlecard.types.V2;

import dev.lilcode.googlecard.types.V2.enums.BorderType;
import lombok.Builder;

@Builder
public record BorderStyle(
    BorderType type,
    Color strokeColor,
    Integer cornerRadius
) {  }
