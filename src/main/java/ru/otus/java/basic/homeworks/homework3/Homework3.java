package ru.otus.java.basic.homeworks.homework3;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 5: ");
        int number = scanner.nextInt();
        switch (number) {
            case 1: {
                greetings();
                break;
            }
            case 2: {
                checkSign(1, 2, 3);
                break;
            }
            case 3: {
                selectColor();
                break;
            }
            case 4: {
                compareNumbers();
                break;
            }
            case 5: {
                addOrSubtractAndPrint (5, 3,false);
                break;
            }
            default:  {
                break;
            }
        }
    }
    public static void greetings(){
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }
    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void selectColor() {
        int data = 125;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 5;
        int b = 118;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment == true) {
            int result = initValue + delta;
            System.out.println("Результат: " + result);
        } else {
            int result = initValue - delta;
            System.out.println("Результат: " + result);
        }
    }
}
