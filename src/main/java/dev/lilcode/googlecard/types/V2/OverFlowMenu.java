package dev.lilcode.googlecard.types.V2;

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
