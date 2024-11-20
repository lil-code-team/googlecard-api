package dev.lilcode.googlecard.types.V1;

import dev.lilcode.googlecard.interfaces.ChatApplicationExclusive;
import lombok.Builder;

import java.util.ArrayList;

/**
 * @deprecated Use {@link dev.lilcode.googlecard.types.V2.Action} instead
 */
@Deprecated()
@ChatApplicationExclusive
@Builder
public record FormAction(
    String actionMethodName,
    ArrayList<ActionParameter> parameters
) {  }
