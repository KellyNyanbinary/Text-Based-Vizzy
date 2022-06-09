package com.kellynyanbinary.textbasedvizzy;

public class VizzyProgram {
    private String program;

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getElement(int elementID) {
        // TODO
        return null;
    }

    /**
     * Adds a new line at the end of the Vizzy program.
     * 
     * @param newLine
     */
    public void addLine(String newLine) {
        program += "\n" + newLine;
    }

    public String outputVizzyAsText() {
        // TODO
        return null;
    }

    public static String convertElementIntoText(String element) {
        // TODO
        return null;
    }

}
