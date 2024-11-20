package dev.lilcode.googlecard.types.V2;

import dev.lilcode.googlecard.types.V2.enums.GridItemLayout;
import lombok.Builder;

import java.util.ArrayList;
import java.util.UUID;

@Builder
public record Grid(
        String title,
        ArrayList<GridItem> items,
        BorderStyle borderStyle,
        Integer columnCount,
        OnClick onClick
) {
    @Builder
    public record GridItem(
        UUID id,
        ImageComponent image,
        String title,
        String subtitle,
        GridItemLayout layout
    ) {  }
}
