package dev.lilcode.googlecard.types.V2;

import dev.lilcode.googlecard.types.V2.enums.ControlType;
import lombok.Builder;

@Builder
public record SwitchControl(
    String name,
    String value,
    Boolean selected,
    Action onChangeAction,
    ControlType controlType
) {  }
