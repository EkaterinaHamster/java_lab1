package kat.hamster.domain;

public class Polygon extends Figure {
    private String type;
    private int numberOfVertices;

    public Polygon() {

    }

    public Polygon(String[] line) {
        super(line[1], line[2]);
        type = line[3];
        numberOfVertices = Integer.parseInt(line[4]);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfVertices() {
        return numberOfVertices;
    }

    public void setNumberOfVertices(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Polygon: ");
        builder.append(super.toString()).append(" | ");
        builder.append("Type: ").append(type).append(" | ");
        builder.append("Number Of Vertices: ").append(numberOfVertices);
        return builder.toString();
    }
}
