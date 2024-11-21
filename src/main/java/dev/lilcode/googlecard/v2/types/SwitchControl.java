package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.v2.types.enums.ControlType;
import lombok.Builder;

@Builder
public record SwitchControl(
    String name,
    String value,
    Boolean selected,
    Action onChangeAction,
    ControlType controlType
) {  }
