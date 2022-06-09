package com.kellynyanbinary.textbasedvizzy;

public abstract class CodeElement {
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return toText();
    }

    public abstract String toText();

    public abstract String toVizzy();
}