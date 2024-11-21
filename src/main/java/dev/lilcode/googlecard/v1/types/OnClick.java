package dev.lilcode.googlecard.v1.types;

import lombok.Builder;

/**
 * @deprecated Use {@link dev.lilcode.googlecard.v2.types.OnClick} instead
 */
@Deprecated()
@Builder
public record OnClick(
    FormAction action,
    OpenLink openLink
) {  }
