package dev.lilcode.googlecard.v2.types;

import lombok.Builder;

@Builder
public record Section(
    String header,
    Widget widget,
    Boolean collapsible,
    Integer uncollapsibleWidgetsCount,
    CollapseControl collapseControl
) {  }
