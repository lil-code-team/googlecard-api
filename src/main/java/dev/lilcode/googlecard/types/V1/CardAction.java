package dev.lilcode.googlecard.types.V1;

import dev.lilcode.googlecard.interfaces.WorkspaceExclusive;
import lombok.Builder;

/**
 * @deprecated Use {@link dev.lilcode.googlecard.types.V2.CardAction} instead
 */
@Deprecated()
@WorkspaceExclusive
@Builder
public record CardAction(
    String actionLabel,
    OnClick onClick
) {  }
