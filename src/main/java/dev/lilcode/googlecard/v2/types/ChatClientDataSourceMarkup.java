package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.interfaces.ChatExclusive;
import lombok.Builder;

@ChatExclusive
@Builder
public record ChatClientDataSourceMarkup(
    SpaceDataSource spaceDataSource
) {  }
