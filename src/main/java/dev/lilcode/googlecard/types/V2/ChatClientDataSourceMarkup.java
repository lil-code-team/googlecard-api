package dev.lilcode.googlecard.types.V2;

import dev.lilcode.googlecard.interfaces.ChatExclusive;
import lombok.Builder;

@ChatExclusive
@Builder
public record ChatClientDataSourceMarkup(
    SpaceDataSource spaceDataSource
) {  }
