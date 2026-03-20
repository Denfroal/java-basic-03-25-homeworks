package ru.otus.java.basic.homeworks.homework20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8080);
        while(true) {
            Socket clientSocket = socket.accept();
            DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
            outputStream.writeUTF(sendInfoForMathOperations());
            String resultStringForCalculation = inputStream.readUTF();
            outputStream.writeUTF(calculateResult(resultStringForCalculation));
            inputStream.close();
            outputStream.close();
        }
    }

    public static String sendInfoForMathOperations() {
        String mathOperationsInfo = "Пользователю доступны следующие математические операции: сложение (+), вычитание (-), умножение (*), деление (/)";
        return mathOperationsInfo;
    }

    public static String calculateResult (String resultStringForCalculation) {
        String[] parts = resultStringForCalculation.split(" ");
        int firstNumber = Integer.parseInt(parts[0]);
        int secondNumber = Integer.parseInt(parts[1]);
        int result;
        String stringResult = null;
        String operation = parts[2];
        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
            stringResult = Integer.toString(result);
        } else if (operation.equals("-")) {
            result = firstNumber - secondNumber;
            stringResult = Integer.toString(result);
        }
            else if (operation.equals("*")) {
                result = firstNumber * secondNumber;
                stringResult = Integer.toString(result);
            } else if (operation.equals("/")) {
                  result = firstNumber / secondNumber;
                  stringResult = Integer.toString(result);
        }
            return stringResult;
    }
}
