package dev.lilcode.googlecard.types.V2;

import lombok.Builder;

import java.util.ArrayList;

@Builder
public record ButtonList(
    ArrayList<Button> buttons
) {  }
