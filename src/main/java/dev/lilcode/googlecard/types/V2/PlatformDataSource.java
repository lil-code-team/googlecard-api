package dev.lilcode.googlecard.types.V2;

import dev.lilcode.googlecard.interfaces.ChatExclusive;
import dev.lilcode.googlecard.types.V2.enums.CommonDataSource;
import lombok.Builder;

@ChatExclusive
@Builder
public record PlatformDataSource(
    CommonDataSource commonDataSource,
    HostAppDataSourceMarkup hostAppDataSource
) {  }
