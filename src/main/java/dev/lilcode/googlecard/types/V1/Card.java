package dev.lilcode.googlecard.types.V1;

import dev.lilcode.googlecard.types.V1.enums.ImageStyle;
import lombok.Builder;

import java.util.ArrayList;

/**
 * @deprecated Use {@link dev.lilcode.googlecard.types.V2.CardsV2} instead
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
