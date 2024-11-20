package dev.lilcode.googlecard.types.V2;

import dev.lilcode.googlecard.types.V2.enums.HorizontalAlignment;
import dev.lilcode.googlecard.types.V2.enums.HorizontalSizeStyle;
import dev.lilcode.googlecard.types.V2.enums.VerticalAlignment;
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
