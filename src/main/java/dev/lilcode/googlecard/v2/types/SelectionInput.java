package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.interfaces.ChatExclusive;
import dev.lilcode.googlecard.v2.types.enums.SelectionType;
import lombok.Builder;

import java.util.ArrayList;

@Builder
public record SelectionInput(
    String name,
    String label,
    SelectionType type,
    ArrayList<SelectionItem> items,
    Action onChangeAction,
    Integer multiSelectMaxSelectedItems,
    Integer multiSelectMinQueryLength,
    Validation validation,
    @ChatExclusive
    Action externalDataSource,
    @ChatExclusive
    PlatformDataSource platformDataSource
) {
    @Builder
    public record SelectionItem(
        String text,
        String value,
        Boolean selected,
        String startIconUri,
        String bottomText
    ) {  }
}
