package by.epam.dedik.day5.service.impl;

public class ArrayDelimiterService {
    static final char[] DELIMITERS = {' ', '{', '}', '!', '\"', '#', '$', '%', '&', '\'',
            '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@',
            '[', '\\', ']', '^', '_', '`', '|', '~'};

    protected int nextDelimiter(char[] chars, int lastDelimiter) {
        int j;
        int i = lastDelimiter + 1;

        while (i < chars.length) {
            j = 0;
            while (j < ArrayDelimiterService.DELIMITERS.length) {
                if (chars[i] == ArrayDelimiterService.DELIMITERS[j++]) {
                    return i;
                }
            }
            i++;
        }
        return chars.length;
    }
}
