package dev.lilcode.googlecard.types.V2;

import dev.lilcode.googlecard.interfaces.ChatExclusive;
import dev.lilcode.googlecard.types.V2.enums.HorizontalAlignment;
import lombok.Builder;

@ChatExclusive
@Builder
public record CollapseControl(
    HorizontalAlignment horizontalAlignment,
    Button expandButton,
    Button collapseButton
) {  }
