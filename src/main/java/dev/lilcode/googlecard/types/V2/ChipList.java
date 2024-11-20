package dev.lilcode.googlecard.types.V2;

import dev.lilcode.googlecard.interfaces.ChatExclusive;
import dev.lilcode.googlecard.types.V2.enums.Layout;
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
