package by.epam.dedik.day5.service;

public interface ChangeText {
    String changeSymbolByPosition(String text, char symbol, int position);

    String changeLetterAfterLetter(String text, char afterLetter, char replaceLetter);

    String changeWordByLength(String text, String word, int length);
}
