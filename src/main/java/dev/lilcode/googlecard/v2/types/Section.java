package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.interfaces.annotations.Validate;
import lombok.Builder;

import java.util.ArrayList;

@Validate
@Builder
public record Section(
        String header,
        ArrayList<Widget> widgets,
        Boolean collapsible,
        Integer uncollapsibleWidgetsCount,
        CollapseControl collapseControl
) {  }
