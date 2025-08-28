package ru.otus.java.basic.homeworks.homework7;

public class Homework7 {
    public static void main(String[] args) {
        int [][] array = {{1,2,3}, {4,5,6}, {7,8,9}};
        int sum = sumOfPositiveElements(array);
        printSquare(6);
        zeroingDiagonal(array);
        findMax(array);
        sumOfElementsSecondRow(array);
    }

    public static int sumOfPositiveElements(int [][] array) {
        int sum = 0;
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] > 0) {
                        sum += array[i][j];
                    }
                }
            }
            return sum;
        } else {
            return 0;
        }
    }

    public static void printSquare (int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void zeroingDiagonal (int [][] array) {
        if (array != null) {
            if (array.length == array[0].length) {
                int elementDiagonal = 0;
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][elementDiagonal] = 0;
                    }
                    elementDiagonal += 1;
                }
            } else {
                System.out.println("У массива нет диагонали");
            }
        } else {
            System.out.println("Массив пустой");
        }
    }

    public static int findMax(int [][] array) {
        int maxElement = array[0][0];
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] > maxElement) {
                        maxElement = array[i][j];
                    }
                }
            }
            return maxElement;
        } else {
            return -1;
        }
    }

    public static int sumOfElementsSecondRow (int [][] array) {
        int sumSecondRow = 0;
        if (array.length > 1) {
            for (int i = 0; i < array[1].length; i++) {
                sumSecondRow += array[1][i];
            }
            return sumSecondRow;
        } else {
            return -1;
        }
    }
}
