package dev.lilcode.googlecard.types.V2;

import dev.lilcode.googlecard.interfaces.ChatApplicationExclusive;
import dev.lilcode.googlecard.types.V2.enums.Interaction;
import dev.lilcode.googlecard.types.V2.enums.LoadIndicator;
import lombok.Builder;

import java.util.ArrayList;

@ChatApplicationExclusive
@Builder
public record Action(
    String function,
    ActionParameter actionParameter,
    LoadIndicator loadIndicator,
    Boolean persistValues,
    Interaction interaction,
    ArrayList<String> requiredWidgets,
    Boolean allWidgetsAreRequired
) {

    @Builder
    public record ActionParameter(
        String key,
        String value
    ) {  }
}
