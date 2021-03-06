package com.kellynyanbinary.textbasedvizzy;

import java.awt.*;
import java.io.*;
import java.util.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

// Please don't fire me because you saw my hobby project code. 
public class App {
    private static final String PROGRAM_NAME = "Text based Vizzy";

    public static void main(String[] args) {
        // System.out.println("Hello, World! Nyaa");

        // System.out.println("Hello, World! Nyaa");

        String[] options = { "Text to Vizzy", "Vizzy to Text" };
        int selectedProgram = JOptionPane.showOptionDialog(null,
                "What to convert?", PROGRAM_NAME, JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (selectedProgram == 0) {

        } else {

        }

        // Make a new JFileChooser
        JFileChooser fileChooser = new JFileChooser();

        // Set preferred size to something reasonable
        fileChooser.setPreferredSize(new Dimension(1600, 900));

        // Set title
        fileChooser.setDialogTitle(PROGRAM_NAME);

        // Set default view to detailed. Solution from Stack Overflow. Why is
        // the solution so hacky?
        fileChooser.getActionMap().get("viewTypeDetails").actionPerformed(null);

        if (selectedProgram == 0) {

        } else {
            // Set default directory to SimpleRockets 2 files
            // I do not know if using file.separator is be of any use because
            // the file structure is going to be different on MacOS and linux
            // anyway.
            String fileSeparator = System.getProperty("file.separator");
            fileChooser.setCurrentDirectory(
                    new File(System.getProperty("user.home") + fileSeparator
                            + "AppData" + fileSeparator + "LocalLow"
                            + fileSeparator + "Jundroo" + fileSeparator
                            + "SimpleRockets 2" + fileSeparator + "UserData"
                            + fileSeparator + "FlightPrograms"));

            // Create a file type filter for XML
            FileNameExtensionFilter fileTypeFilter = new FileNameExtensionFilter(
                    "Vizzy file", "xml");
            fileChooser.setFileFilter(fileTypeFilter);
        }

        // Show fileChooser
        int returnValue = fileChooser.showOpenDialog(fileChooser);

        // Gets the file
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            // JOptionPane.showMessageDialog(null,
            // "File chosen is " + fileChooser.getSelectedFile().getPath(),
            // "Vizzy to Text", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No file chosen. \nEnding program. ", PROGRAM_NAME,
                    JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        VizzyProgram vizzyProgram = vizzyToText(fileChooser);

        // Debugging stuff
        System.out.println(vizzyProgram.getProgram());
        System.out.println(vizzyProgram.outputVizzyAsText());
        System.out.println("End of program. Exiting. ");
    }

    private void textToVizzy(String text) {
        // TODO
    }

    private static VizzyProgram vizzyToText(JFileChooser fileChooser) {
        // Tries to read from the file and make a new vizzy program object from
        // it.

        String text = "";
        try {
            Scanner scanner = new Scanner(fileChooser.getSelectedFile());

            int lineIndex = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                System.out.println("line " + lineIndex + ": " + line);

                // Adds each line to vizzyProgram
                text += "\n" + line;

                lineIndex++;
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,
                    "File not found. \nEnding program. ", PROGRAM_NAME,
                    JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        VizzyProgram vizzyProgram = new VizzyProgram(text);

        return vizzyProgram;
    }

}
