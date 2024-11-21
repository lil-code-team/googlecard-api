package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.interfaces.ChatExclusive;
import dev.lilcode.googlecard.v2.types.enums.HorizontalAlignment;
import lombok.Builder;

@ChatExclusive
@Builder
public record CollapseControl(
    HorizontalAlignment horizontalAlignment,
    Button expandButton,
    Button collapseButton
) {  }
