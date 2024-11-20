package dev.lilcode.googlecard.types.V1;

import lombok.Builder;

import java.util.ArrayList;

/**
 * @deprecated Use {@link dev.lilcode.googlecard.types.V2.Widget} instead
 */
@Deprecated()
@Builder
public record WidgetMarkup(
    ArrayList<Button> buttons,
    TextParagraph textParagraph,
    Image image,
    KeyValue keyValue
) {  }
