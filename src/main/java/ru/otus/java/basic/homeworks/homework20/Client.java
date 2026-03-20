package ru.otus.java.basic.homeworks.homework20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
            try (Socket socket = new Socket("localhost", 8080)) {
                DataInputStream inputStream = new DataInputStream(socket.getInputStream());
                DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
                while (true) {
                    String infoForMathOperations = inputStream.readUTF();
                    System.out.println(infoForMathOperations);
                    System.out.println("Введите два числа и необходимую операцию");
                    try {
                        System.out.print("Первое число = ");
                        String firstNumber = scanner.nextLine();
                        Integer.parseInt(firstNumber);
                        System.out.print("Второе число = ");
                        String secondNumber = scanner.nextLine();
                        Integer.parseInt(secondNumber);
                        System.out.print("Введите операцию: ");
                        String operation = scanner.nextLine();
                        if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
                            outputStream.writeUTF(resultStringForCalculation(firstNumber, secondNumber, operation));
                        } else System.out.println("Введенной математической операции не существует");
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Ошибка. Введено не число");
                    }
                    String result = inputStream.readUTF();
                    System.out.println("Результат операции = " + result);
                    inputStream.close();
                    outputStream.close();
                }
            }
    }
    public static String resultStringForCalculation(String firstNumber, String secondNumber, String operation) {
        return firstNumber + " " + secondNumber + " " + operation;
    }
}
