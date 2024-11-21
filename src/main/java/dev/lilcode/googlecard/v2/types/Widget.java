package dev.lilcode.googlecard.v2.types;

import dev.lilcode.googlecard.v2.types.enums.HorizontalAlignment;
import lombok.Builder;

@Builder
public record Widget(
    HorizontalAlignment horizontalAlignment,
    TextParagraph textParagraph,
    Image image,
    DecoratedText decoratedText,
    ButtonList buttonList,
    TextInput textInput,
    SelectionInput selectionInput,
    DateTimerPicker dateTimerPicker,
    Divider divider,
    Grid grid,
    Columns columns,
    ChipList chipList
) {  }
