package dev.lilcode.googlecard.types.V2;

import dev.lilcode.googlecard.types.V2.enums.InputType;
import lombok.Builder;

@Builder
public record Validation(
    Integer characterLimit,
    InputType inputType
) {  }
