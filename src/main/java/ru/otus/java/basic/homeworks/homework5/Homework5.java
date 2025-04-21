package ru.otus.java.basic.homeworks.homework5;

public class Homework5 {
    public static void main(String[] args) {
        printString(3, "Denis");
        sumOfElements (new int[] {1, 8, 12, 21, 5});
        fillArray (3, new int [5]);
        increaseArrayElements (4, new int [] {1, 25, 103});
        maxSumElementsOfHalfArray(new int[] {6,5,4,3,2});
    }
    public static void printString (int number, String str) {
        for (int i = 0; i < number; i++) {
            System.out.println(str);
        }
    }
    public static void sumOfElements (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                sum += array[i];
            }
        }
        System.out.println("Полученная сумма: " + sum);
    }
    public static void fillArray (int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("a[" + i + "] = " + array[i]);
        }
    }
    public static void increaseArrayElements(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += number;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("a[" + i + "] = " + array[i]);
        }
    }

    public static void maxSumElementsOfHalfArray (int[] array) {
        int sumFirstHalfArray = 0;
        int sumSecondHalfArray = 0;
        if (array.length %2 == 0) {
            int middleArray = array.length / 2;
            for (int i = 0; i <= middleArray - 1 ; i++) {
                sumFirstHalfArray += array[i];
            }
            for (int i = middleArray; i < array.length; i++) {
                sumSecondHalfArray += array[i];
            }
            if (sumFirstHalfArray > sumSecondHalfArray) {
                System.out.println("Сумма элементов = " + sumFirstHalfArray);
            } else {
                System.out.println("Сумма элементов = " + sumSecondHalfArray);
            }
        } else {
            int middleArray = Math.round(array.length / 2 + 1); // Прибавление единицы для корректного округления значения середины массива, так как round округляет в меньшую сторону
            System.out.println(middleArray);
            for (int i = 0; i < middleArray; i++) {
                sumFirstHalfArray += array[i];
            }
            for (int i = middleArray - 1; i < array.length; i++) {
                sumSecondHalfArray += array[i];
            }
            if (sumFirstHalfArray > sumSecondHalfArray) {
                System.out.println("Сумма элементов = " + sumFirstHalfArray);
            } else {
                System.out.println("Сумма элементов = " + sumSecondHalfArray);
            }
        }
    }
}
