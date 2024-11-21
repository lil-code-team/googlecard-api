package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.v2.types.enums.BorderType;
import lombok.Builder;

@Builder
public record BorderStyle(
    BorderType type,
    Color strokeColor,
    Integer cornerRadius
) {  }
