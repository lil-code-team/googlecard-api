package dev.lilcode.googlecard.types.V1;

import dev.lilcode.googlecard.types.V1.enums.Icon;
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
