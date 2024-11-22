package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.interfaces.annotations.ChatExclusive;
import lombok.Builder;

@ChatExclusive
@Builder
public record HostAppDataSourceMarkup(
    ChatClientDataSourceMarkup chatDataSource
) {  }
