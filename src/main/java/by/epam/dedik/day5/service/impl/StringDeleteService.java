package by.epam.dedik.day5.service.impl;

import by.epam.dedik.day5.service.DeleteText;

public class StringDeleteService implements DeleteText {
    private static final String PUNCTUATION_BETWEEN_LETTERS = "\\w\\p{Punct}\\w";
    private static final String PUNCTUATION = "\\p{Punct}";
    private static final String WORD_STARTS_WITH_VOWEL_WITH_LENGTH = "(?<=\\b)[eyuioa]\\w{%d}(?!\\w)";
    private static final String SPACE = " ";
    private static final String EMPTY = "";

    @Override
    public String deleteSymbolsExceptLetters(String text) {
        return text.replaceAll(PUNCTUATION_BETWEEN_LETTERS, SPACE).replaceAll(PUNCTUATION, EMPTY);
    }

    @Override
    public String deleteVowelWordsByLength(String text, int length) {
        return text.replaceAll(String.format(WORD_STARTS_WITH_VOWEL_WITH_LENGTH, length - 1), EMPTY);
    }
}
