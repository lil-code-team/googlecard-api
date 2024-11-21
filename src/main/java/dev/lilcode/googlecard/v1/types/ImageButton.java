package dev.lilcode.googlecard.v1.types;

import dev.lilcode.googlecard.v1.types.enums.Icon;
import dev.lilcode.googlecard.v2.types.Button;
import lombok.Builder;

/**
 * @deprecated Use {@link Button} instead
 */
@Deprecated()
@Builder
public record ImageButton(
    String name,
    OnClick onClick,
    Icon icon,
    String iconUrl
) {  }
