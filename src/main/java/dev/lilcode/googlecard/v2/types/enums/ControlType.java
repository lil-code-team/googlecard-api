package dev.lilcode.googlecard.v2.types.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ControlType {
    SWITCH,
    /**
     * @deprecated Use {@link #CHECK_BOX} instead.
     */
    @Deprecated(forRemoval = true)
    CHECKBOX,
    CHECK_BOX;
}
