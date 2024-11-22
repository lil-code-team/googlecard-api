package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.interfaces.annotations.ChatExclusive;
import dev.lilcode.googlecard.v2.types.enums.CommonDataSource;
import lombok.Builder;

@ChatExclusive
@Builder
public record PlatformDataSource(
    CommonDataSource commonDataSource,
    HostAppDataSourceMarkup hostAppDataSource
) {  }
