package dev.lilcode.googlecard.types.V2;

import dev.lilcode.googlecard.interfaces.WorkspaceExclusive;
import dev.lilcode.googlecard.types.V2.enums.DisplayStyle;
import dev.lilcode.googlecard.types.V2.enums.DividerStyle;
import dev.lilcode.googlecard.types.V2.enums.ImageType;
import lombok.Builder;

import java.util.ArrayList;

@Builder
public record Card(
    CardHeader header,
    ArrayList<Section> section,
    DividerStyle sectionDividerStyle,
    ArrayList<CardAction> cardAction,
    @WorkspaceExclusive
    String name,
    CardFixedFooter fixedFooter,
    DisplayStyle displayStyle,
    @WorkspaceExclusive
    CardHeader peekCardHeader
) {
    @Builder
    public record CardHeader(
        String title,
        String subtitle,
        ImageType imageType,
        String imageUrl,
        String imageAltText
    ) {  }
}