package by.epam.dedik.day5.service.impl;

import by.epam.dedik.day5.service.DeleteText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDeleteService implements DeleteText {
    private static final String PUNCTUATION_BETWEEN_LETTERS = "\\w\\p{Punct}\\w";
    private static final String PUNCTUATION = "\\p{Punct}";
    private static final String SPACE = " ";
    private static final String EMPTY = "";
    private static final String WORD_STARTS_WITH_VOWEL_WITH_LENGTH =
            "(?<=\\b)[eyuioa]\\w{%d}(?!\\w)";

    @Override
    public String deleteSymbolsExceptLetters(String text) {
        Pattern patternBetweenWords = Pattern.compile
                (PUNCTUATION_BETWEEN_LETTERS);
        Matcher matcherBetweenWords = patternBetweenWords.matcher(text);
        String processingText = matcherBetweenWords.replaceAll(SPACE);
        Pattern patternClearPunctuation = Pattern.compile(PUNCTUATION);
        Matcher matcherClearPunctuation = patternClearPunctuation.
                matcher(processingText);
        return matcherClearPunctuation.replaceAll(EMPTY);
    }

    @Override
    public String deleteVowelWordsByLength(String text, int length) {
        Pattern pattern = Pattern.compile
                (String.format(WORD_STARTS_WITH_VOWEL_WITH_LENGTH, length - 1));
        Matcher matcher = pattern.matcher(text);
        return matcher.replaceAll("");
    }
}
