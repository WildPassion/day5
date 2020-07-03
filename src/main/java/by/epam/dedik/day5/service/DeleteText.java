package by.epam.dedik.day5.service;

public interface DeleteText {
    String deleteSymbolsExceptLetters(String text);

    String deleteVowelWordsByLength(String text, int length);
}
