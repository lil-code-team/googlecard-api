package dev.lilcode.googlecard.types.V1;

import dev.lilcode.googlecard.types.V1.enums.Icon;
import lombok.Builder;

/**
 * @deprecated Use {@link dev.lilcode.googlecard.types.V2.Button} instead
 */
@Deprecated()
@Builder
public record ImageButton(
    String name,
    OnClick onClick,
    Icon icon,
    String iconUrl
) {  }
