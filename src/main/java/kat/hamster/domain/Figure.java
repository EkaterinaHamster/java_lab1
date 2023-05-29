package kat.hamster.domain;

import java.io.Serializable;

public class Figure implements Serializable {
    private String backgroundColor;
    private String borderColor;

    public Figure() {
    }

    public Figure(String backgroundColor, String borderColor) {
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public String GetBackgroundColor() {
        return this.backgroundColor;
    }

    public String GetBorderColor() {
        return this.borderColor;
    }

    public void SetBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void GetBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Background Color: ").append(backgroundColor).append(" | ");
        builder.append("Border Color: ").append(borderColor).append(" | ");
        return builder.toString();
    }
}
