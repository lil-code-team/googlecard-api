package dev.lilcode.googlecard.types.V1;

import lombok.Builder;

/**
 * @deprecated Use {@link dev.lilcode.googlecard.types.V2.OnClick} instead
 */
@Deprecated()
@Builder
public record OnClick(
    FormAction action,
    OpenLink openLink
) {  }
