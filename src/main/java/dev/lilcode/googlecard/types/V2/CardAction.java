package dev.lilcode.googlecard.types.V2;

import dev.lilcode.googlecard.interfaces.WorkspaceExclusive;
import lombok.Builder;

@WorkspaceExclusive
@Builder
public record CardAction(
    String actionLabel,
    OnClick onClick
) {  }
