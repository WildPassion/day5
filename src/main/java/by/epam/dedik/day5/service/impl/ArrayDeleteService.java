package by.epam.dedik.day5.service.impl;

import by.epam.dedik.day5.service.DeleteText;

public class ArrayDeleteService extends ArrayDelimiterService implements DeleteText {
    @Override
    public String deleteSymbolsExceptLetters(String text) {
        char[] chars = text.toCharArray();
        int j;
        for (int i = 0; i < chars.length; i++) {
            j = 0;
            if (Character.isDigit(chars[i])){
                chars[i++] = ' ';
            }
            while (j < DELIMITERS.length){
                if(chars[i] == DELIMITERS[j++]){
                    chars[i] = ' ';
                    break;
                }
            }
        }
        return String.valueOf(chars);
    }

    @Override
    public String deleteVowelWordsByLength(String text, int length) {
        return null;
    }
}
