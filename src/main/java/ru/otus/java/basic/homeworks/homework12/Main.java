package ru.otus.java.basic.homeworks.homework12;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat[] cats =
                     {  new Cat("Olivka", 7),
                        new Cat("Barsik", 12),
                        new Cat ("Moris", 15)};
        ArrayList <Cat> arrayCats = new ArrayList<>(Arrays.asList(cats));
        Plate plate = new Plate (30);
        for (int i = 0; i < arrayCats.size(); i++) {
            arrayCats.get(i).eatFood(plate);
            plate.reduceFood(arrayCats.get(i).getAppetite());
        }
        for (int i = 0; i < arrayCats.size(); i++) {
            arrayCats.get(i).info();
        }
    }
}
