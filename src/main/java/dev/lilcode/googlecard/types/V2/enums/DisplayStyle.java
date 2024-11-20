package dev.lilcode.googlecard.types.V2.enums;

import dev.lilcode.googlecard.interfaces.WorkspaceExclusive;
import lombok.AllArgsConstructor;

@WorkspaceExclusive
@AllArgsConstructor
public enum DisplayStyle {
    DISPLAY_STYLE_UNSPECIFIED,
    PEEK,
    REPLACE;
}