package kat.hamster.csvHandler;

import kat.hamster.domain.Ellipse;
import kat.hamster.domain.Figure;
import kat.hamster.domain.Polygon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvHandler {
    public static List<String[]> readCsvFile(String fileName, String regex) {
        List<String[]> strings = new ArrayList<>();
        File file = new File(fileName);
        try {
            InputStreamReader streamReader = new InputStreamReader(new FileInputStream(file), "windows-1251");
            BufferedReader bufferedReader = new BufferedReader(streamReader);
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {
                String[] splitString = fileLine.split(regex);
                strings.add(splitString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    public List<String[]> inputStrings;

    public CsvHandler() {
    }

    public CsvHandler(String fileName) {
        this.inputStrings = CsvHandler.readCsvFile(fileName, ",");
    }

    public List<Figure> GetFigureFromCsvFile() {
        List<Figure> figure = new ArrayList<>();
        for (String[] line : inputStrings) {
            if (line[0].equals("0")) {
                figure.add(new Ellipse(line));
            } else {
                figure.add(new Polygon(line));
            }
        }
        return figure;
    }
}
