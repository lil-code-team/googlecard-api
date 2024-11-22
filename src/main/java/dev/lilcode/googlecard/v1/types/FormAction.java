package dev.lilcode.googlecard.v1.types;

import dev.lilcode.googlecard.interfaces.annotations.ChatApplicationExclusive;
import dev.lilcode.googlecard.v2.types.Action;
import lombok.Builder;

import java.util.ArrayList;

/**
 * @deprecated Use {@link Action} instead
 */
@Deprecated()
@ChatApplicationExclusive
@Builder
public record FormAction(
    String actionMethodName,
    ArrayList<ActionParameter> parameters
) {  }
