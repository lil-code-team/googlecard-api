package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.interfaces.ChatExclusive;
import lombok.Builder;

import java.util.ArrayList;

@ChatExclusive
@Builder
public record OverFlowMenu(
    ArrayList<OverFlowMenuItem> items
) {

    @ChatExclusive
    @Builder
    public record OverFlowMenuItem(
        Icon StartIcon,
        String text,
        OnClick onClick,
        Boolean enabled
    ) {  }
}
