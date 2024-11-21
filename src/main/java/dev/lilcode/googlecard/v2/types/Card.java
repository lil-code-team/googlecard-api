package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.interfaces.WorkspaceExclusive;
import dev.lilcode.googlecard.v2.types.enums.DisplayStyle;
import dev.lilcode.googlecard.v2.types.enums.DividerStyle;
import dev.lilcode.googlecard.v2.types.enums.ImageType;
import lombok.Builder;
import lombok.Setter;

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