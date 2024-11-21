package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.interfaces.WorkspaceExclusive;
import lombok.Builder;

@WorkspaceExclusive
@Builder
public record CardAction(
    String actionLabel,
    OnClick onClick
) {  }
