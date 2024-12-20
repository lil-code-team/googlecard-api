package dev.lilcode.googlecard.v1.types;

import dev.lilcode.googlecard.interfaces.annotations.SingleFilledAttribute;
import dev.lilcode.googlecard.v2.types.Widget;
import lombok.Builder;

import java.util.ArrayList;

/**
 * @deprecated Use {@link Widget} instead
 */
@Deprecated()
@SingleFilledAttribute
@Builder
public record WidgetMarkup(
    ArrayList<Button> buttons,
    TextParagraph textParagraph,
    Image image,
    KeyValue keyValue
) {  }
