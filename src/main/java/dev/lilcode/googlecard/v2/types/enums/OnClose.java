package dev.lilcode.googlecard.v2.types.enums;

import dev.lilcode.googlecard.interfaces.WorkspaceExclusive;
import lombok.AllArgsConstructor;

@WorkspaceExclusive
@AllArgsConstructor
public enum OnClose {
    NOTHING,
    RELOAD;
}