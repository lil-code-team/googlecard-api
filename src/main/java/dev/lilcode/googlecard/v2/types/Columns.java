package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.v2.types.enums.HorizontalAlignment;
import dev.lilcode.googlecard.v2.types.enums.HorizontalSizeStyle;
import dev.lilcode.googlecard.v2.types.enums.VerticalAlignment;
import lombok.Builder;

import java.util.ArrayList;

@Builder
public record Columns(
    ArrayList<Column> columnItems
) {
    @Builder
    public record Column(
        HorizontalSizeStyle horizontalSizeStyle,
        HorizontalAlignment horizontalAlignment,
        VerticalAlignment verticalAlignment,
        ArrayList<Widget> widgets
    ) {  }
}
