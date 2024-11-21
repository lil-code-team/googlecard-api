package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.v2.types.enums.InputType;
import lombok.Builder;

@Builder
public record Validation(
    Integer characterLimit,
    InputType inputType
) {  }
