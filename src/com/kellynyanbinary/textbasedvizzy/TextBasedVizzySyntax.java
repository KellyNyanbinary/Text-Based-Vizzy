package com.kellynyanbinary.textbasedvizzy;

public class TextBasedVizzySyntax {
    private static char[] endOfLineChar = { ';', '{' };
    private static char startOfBlockChar = '{';
    private static char endOfBlockChar = '}';
    private static String indentString = "    ";
    private static char stringEnclosureChar = '\"';

    public static char[] getEndOfLineChar() {
        return endOfLineChar;
    }

    public static char getStartOfBlockChar() {
        return startOfBlockChar;
    }

    public static char getEndOfBlockChar() {
        return endOfBlockChar;
    }

    public static String getIndentString() {
        return indentString;
    }

    public static char getStringEnclosureChar() {
        return stringEnclosureChar;
    }
}
