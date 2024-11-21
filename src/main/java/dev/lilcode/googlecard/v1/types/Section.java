package dev.lilcode.googlecard.v1.types;

import lombok.Builder;
import java.util.ArrayList;

/**
 * @deprecated Use {@link dev.lilcode.googlecard.v2.types.Section} instead
 */
@Deprecated()
@Builder
public record Section(
        String header,
        ArrayList<WidgetMarkup> widget
) {  }
