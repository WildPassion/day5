package by.epam.dedik.day5.service.impl;

import by.epam.dedik.day5.service.ChangeText;

public class StringChangeService implements ChangeText {
    private static final String SYMBOL_BY_POSITION = "(?<=\\b\\w{%d})[\\w]";
    private static final String WORD_WITH_LENGTH = "(?<=\\b)\\w{%d}(?!\\w)";

    @Override
    public String changeSymbolByPosition(String text, char symbol, int position) {
        return text.replaceAll(String.format(SYMBOL_BY_POSITION, position - 1), String.valueOf(symbol));
    }

    @Override
    public String changeLetterAfterLetter(String text, char afterLetter, char replaceLetter) {
        return text.replaceAll(afterLetter + "\\w", String.valueOf(afterLetter) + replaceLetter);
    }

    @Override
    public String changeWordByLength(String text, String word, int length) {
        return text.replaceAll(String.format(WORD_WITH_LENGTH, length), word);
    }
}
