package dev.lilcode.googlecard.types.V2;

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
