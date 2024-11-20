package dev.lilcode.googlecard.types.V2;

import dev.lilcode.googlecard.types.V2.enums.OnClose;
import dev.lilcode.googlecard.types.V2.enums.OpenAs;
import lombok.Builder;

@Builder
public record OpenLink(
    String url,
    OpenAs openAs,
    OnClose onClose
) {  }
