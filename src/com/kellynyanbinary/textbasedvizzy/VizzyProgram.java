package com.kellynyanbinary.textbasedvizzy;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

// import org.w3c.dom.Document;

//import org.w3c.dom.*;

public class VizzyProgram {
    private String program;

    public VizzyProgram(String program) {
        // Who decided this is how you initialize a DOM???
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
                .newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory
                    .newDocumentBuilder();
            // Document doc = documentBuilder.parse(program);
        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        setProgram(program);
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String outputVizzyAsText() {
        // TODO
        return null;
    }

    /**
     * Returns the instruction with the ID in XML format, including daughter
     * instructions and expressions.
     * 
     * @param instructionID
     * @return
     */
    public String getInstruction(int instructionID) {
        // TODO
        return null;
    }

    /**
     * Adds a new line at the end of the Vizzy program.
     * 
     * @param newLine
     */
    public void addLine(String newLine) {
        program.concat("\n".concat(newLine));
    }

    /**
     * Helper method that converts an element into text.
     * 
     * @param element
     * @return
     */
    public static String convertElementIntoText(String element) {
        // TODO
        return null;
    }

    public String[] getProgramAsArray() {
        return program.split("\n");
    }

    /**
     * Finds the beginning of an XML element at or after startLine. Precontiion:
     * startLine is not in the middle of an element.
     * 
     * @param startLine the first line to begin searching form, inclusive
     * @return the line at which the beginning of the element is. Returns -1 if
     *         the beginning of an element could not be found.
     */
    private int findBeginningOfElement(int startLine) {
        for (int i = startLine; i < getProgramAsArray().length; i++) {
            if (getProgramAsArray()[i].contains("<")) {
                return i;
            }
        }

        return -1;
    }

}
