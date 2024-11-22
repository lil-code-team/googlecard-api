package dev.lilcode.googlecard.v1.types;

import dev.lilcode.googlecard.interfaces.annotations.WorkspaceExclusive;
import lombok.Builder;

/**
 * @deprecated Use {@link dev.lilcode.googlecard.v2.types.CardAction} instead
 */
@Deprecated()
@WorkspaceExclusive
@Builder
public record CardAction(
    String actionLabel,
    OnClick onClick
) {  }
