package dev.lilcode.googlecard.types.V2;

import lombok.Builder;

@Builder
public record CardFixedFooter(
    Button primaryButton,
    Button secondaryButton
) {  }
