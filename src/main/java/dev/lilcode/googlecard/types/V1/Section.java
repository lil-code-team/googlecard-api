package dev.lilcode.googlecard.types.V1;

import lombok.Builder;
import java.util.ArrayList;

/**
 * @deprecated Use {@link dev.lilcode.googlecard.types.V2.Section} instead
 */
@Deprecated()
@Builder
public record Section(
        String header,
        ArrayList<WidgetMarkup> widget
) {  }
