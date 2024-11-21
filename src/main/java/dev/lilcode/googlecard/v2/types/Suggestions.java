package dev.lilcode.googlecard.v2.types;

import lombok.Builder;

import java.util.ArrayList;

@Builder
public record Suggestions(
    ArrayList<SuggestionItem> items
) {  }
