package ru.otus.java.basic.homeworks.homework18;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 5, 7, 6, 4, 8, 9, 10);
        FindElement<Integer> tree = new FindElement<>(intList);
        System.out.println(tree.find(8));
        System.out.println(tree.find(0));
        List<Integer> resultList = tree.getSortedList(intList);
        System.out.println("Отсортированный список: " + resultList);
    }
}
