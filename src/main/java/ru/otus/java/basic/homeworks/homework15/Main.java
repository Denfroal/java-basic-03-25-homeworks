package ru.otus.java.basic.homeworks.homework15;

public class Main {

    public static void main(String[] args)  {
        String testArray [][] = {
                {"1", "2", "3", "4"},
                {"2", "6", "4", "9"},
                {"4", "апы", "7", "6"},
                {"4", "5", "7", "6"}
        };
        try {
            System.out.println("Сумма элементов двумерного массива равна " + sumElementsArray(testArray));
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int sumElementsArray(String [][] stringArray) throws AppArraySizeException, AppArrayDataException {
        int rows = stringArray.length;
        int cols = stringArray[0].length;
        if (rows != 4 || cols != 4) {
            throw new AppArraySizeException("Введенный массив не соответствует размеру 4x4");
        }
        int [][] intArray = new int[4][4];
        int sumElements = 0;
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[0].length; j++) {
                try {
                    intArray[i][j] = Integer.parseInt(stringArray[i][j]);
                    sumElements += intArray[i][j];
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Строковое значение не преобразовано в числовое, строка: " + i + ", столбец: " + j + ".");
                }
            }
        }
        return sumElements;
    }
}
