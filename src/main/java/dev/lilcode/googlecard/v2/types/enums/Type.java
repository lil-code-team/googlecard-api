package dev.lilcode.googlecard.v2.types.enums;

import dev.lilcode.googlecard.interfaces.ChatExclusive;
import lombok.AllArgsConstructor;

@ChatExclusive
@AllArgsConstructor
public enum Type {
    TYPE_UNSPECIFIED,
    OUTLINED,
    FILLED,
    FILLED_TONAL,
    BORDERLESS;
}
