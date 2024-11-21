package dev.lilcode.googlecard.v2.types;

import lombok.Builder;

@Builder
public record DecoratedText(
    Icon icon,
    Icon startIcon,
    String topLabel,
    String text,
    String wrapText,
    String bottomLabel,
    OnClick onClick,
    Button button,
    SwitchControl switchControl,
    Icon endIcon
) {  }
