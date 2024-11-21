package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.v2.types.enums.DateTimePickerType;
import lombok.Builder;

@Builder
public record DateTimerPicker(
    String name,
    String label,
    DateTimePickerType type,
    String valueMsEpoch,
    Integer timezoneOffsetDate,
    Action onChangeAction,
    Validation validation
) {  }
