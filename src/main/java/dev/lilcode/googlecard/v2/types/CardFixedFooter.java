package dev.lilcode.googlecard.v2.types;

import lombok.Builder;

@Builder
public record CardFixedFooter(
    Button primaryButton,
    Button secondaryButton
) {  }
