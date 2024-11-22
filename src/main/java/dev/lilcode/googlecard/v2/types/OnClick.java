package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.interfaces.annotations.WorkspaceExclusive;
import lombok.Builder;

@Builder
public record OnClick(
    Action action,
    OpenLink openLink,
    @WorkspaceExclusive
    Action openDynamicLinkAction,
    @WorkspaceExclusive
    Card card,
    OverFlowMenu overFlowMenu
) {  }
