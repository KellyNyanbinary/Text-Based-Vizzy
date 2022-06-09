package com.kellynyanbinary.textbasedvizzy;

public class TextBasedVizzyProgram {
    private String program;

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * Gets the line at lineIndex. 
     * 
     * @param lineIndex
     * @return The line at lineIndex
     */
    public String getLine(int lineIndex) {
        return getProgramAsArray()[lineIndex];
    }

    private String[] getProgramAsArray() {
        // Get the number of end of line characters (and thus line count)
        int index = 0;
        int lineCount = 0;
        while (getLineEndCharIndex(index) != -1) {
            lineCount++;
            index = getLineEndCharIndex(index);
        }

        // Separate the program String into an array of individual program lines
        index = 0;
        String[] programAsArray = new String[lineCount];
        for (int i = 0; i < lineCount; i++) {
            programAsArray[i] = program.substring(index,
                    getLineEndCharIndex(index));
        }

        return programAsArray;
    }

    /**
     * Gets the index of the first instance of endOfLineChar after fromIndex.
     * 
     * @param fromIndex
     * @return
     */
    private int getLineEndCharIndex(int fromIndex) {
        int index = program.length();
        for (char endOfLineChar : TextBasedVizzySyntax.getEndOfLineChar()) {
            if (program.indexOf(endOfLineChar, fromIndex) < index
                    && program.indexOf(endOfLineChar, fromIndex) != -1) {
                index = program.indexOf(endOfLineChar, fromIndex);
            }
        }

        if (index == program.length()) {
            index = -1;
        }

        return index;
    }

    public String outputTextAsVizzy() {
        // TODO
        return null;
    }
}
