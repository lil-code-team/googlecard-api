package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.interfaces.ChatExclusive;
import dev.lilcode.googlecard.v2.types.enums.Layout;
import lombok.Builder;

import java.util.ArrayList;

@ChatExclusive
@Builder
public record ChipList(
    Layout layout,
    ArrayList<Chip> chips
) {
    @ChatExclusive
    @Builder
    public record Chip(
        Icon icon,
        String label,
        OnClick onClick,
        Boolean enabled,
        Boolean disabled,
        String altText
    ) {  }
}
