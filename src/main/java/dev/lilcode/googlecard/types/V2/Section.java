package dev.lilcode.googlecard.types.V2;

import lombok.Builder;

@Builder
public record Section(
    String header,
    Widget widget,
    Boolean collapsible,
    Integer uncollapsibleWidgetsCount,
    CollapseControl collapseControl
) {  }
