package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.v2.types.enums.OnClose;
import dev.lilcode.googlecard.v2.types.enums.OpenAs;
import lombok.Builder;

@Builder
public record OpenLink(
    String url,
    OpenAs openAs,
    OnClose onClose
) {  }
