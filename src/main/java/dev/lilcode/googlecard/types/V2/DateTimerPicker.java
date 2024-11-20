package dev.lilcode.googlecard.types.V2;

import dev.lilcode.googlecard.types.V2.enums.DateTimePickerType;
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
