package kat.hamster.domain;

public class Ellipse extends Figure {
    private int width;
    private int length;

    public Ellipse() {
    }

    public Ellipse(String[] line) {
        super(line[1], line[2]);
        this.width = Integer.parseInt(line[3]);
        this.length = Integer.parseInt(line[4]);
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ellipse: ");
        builder.append(super.toString());
        builder.append("Width: ").append(width).append(" | ");
        builder.append("Length: ").append(length);
        return builder.toString();
    }
}
