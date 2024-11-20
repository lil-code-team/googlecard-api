package dev.lilcode.googlecard.types.V2;

import lombok.Builder;

import java.util.ArrayList;

@Builder
public record Suggestions(
    ArrayList<SuggestionItem> items
) {  }
