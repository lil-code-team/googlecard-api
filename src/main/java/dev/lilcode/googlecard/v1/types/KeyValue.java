package dev.lilcode.googlecard.v1.types;

import dev.lilcode.googlecard.v1.types.enums.Icon;
import lombok.Builder;

/**
 * @deprecated This class is deprecated and will be removed in the next major version of the api.
 */
@Deprecated()
@Builder
public record KeyValue(
    String topLabel,
    String content,
    Boolean contentMultiline,
    String bottomLabel,
    OnClick onClick,
    Icon icon,
    String iconUrl,
    Button button
) {  }
