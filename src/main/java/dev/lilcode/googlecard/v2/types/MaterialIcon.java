package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.interfaces.annotations.ChatExclusive;
import lombok.Builder;

@ChatExclusive
@Builder
public record MaterialIcon(
    String name,
    Boolean fill,
    Integer weight,
    Integer grade
) {  }
