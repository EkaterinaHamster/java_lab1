package kat.hamster;

import kat.hamster.csvHandler.CsvHandler;
import kat.hamster.csvHandler.SerializeUtils;
import kat.hamster.domain.Figure;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("You must specify data file name and serialize file name!");
            return;
        }

        String sourceFile = args[0];
        String binFile = args[1];

        var csvHandler = new CsvHandler(sourceFile);
        var figures = csvHandler.GetFigureFromCsvFile();
        figures.forEach(System.out::println);

        SerializeUtils.serialize(figures, binFile);
        List<Figure> newPersons = (List<Figure>) SerializeUtils.deserialize(binFile);
        System.out.println("Новые фигуры:");
        newPersons.forEach(System.out::println);
    }
}