package dev.lilcode.googlecard.v2.types.enums;

import dev.lilcode.googlecard.interfaces.annotations.ChatExclusive;
import lombok.AllArgsConstructor;

@ChatExclusive
@AllArgsConstructor
public enum Interaction {
    INTERACTION_UNSPECIFIED,
    OPEN_DIALOG;
}
