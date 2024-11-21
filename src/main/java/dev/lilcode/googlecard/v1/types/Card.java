package dev.lilcode.googlecard.v1.types;

import dev.lilcode.googlecard.v1.types.enums.ImageStyle;
import dev.lilcode.googlecard.v2.types.CardsV2;
import lombok.Builder;

import java.util.ArrayList;

/**
 * @deprecated Use {@link CardsV2} instead
 */
@Deprecated()
@Builder
public record Card(
    CardHeader header,
    ArrayList<Section> sections,
    ArrayList<CardAction> cardActions,
    String name
) {
    @Builder
    public record CardHeader(
        String title,
        String subtitle,
        ImageStyle imageStyle,
        String imageUrl
    ) {  }
}
