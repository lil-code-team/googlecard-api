package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.interfaces.annotations.ChatApplicationExclusive;
import dev.lilcode.googlecard.interfaces.annotations.ChatExclusive;
import dev.lilcode.googlecard.interfaces.annotations.WorkspaceExclusive;
import dev.lilcode.googlecard.v2.types.enums.Type;
import lombok.Builder;

@ChatApplicationExclusive
@Builder
public record TextInput(
    String name,
    String label,
    String hintText,
    String value,
    Type type,
    Action onChangeAction,
    Suggestions initialSuggestions,
    @WorkspaceExclusive
    Action autoCompleteAction,
    Validation validation,
    @ChatExclusive
    String placeholderText
) {  }
