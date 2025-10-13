package ru.otus.java.basic.homeworks.homework19;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File projectRoot = new File("files");
        File[] files = projectRoot.listFiles();
        if (files != null) {
            System.out.println("Список текстовых файлов в каталоге проекта:");
            for (File file: files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Список файлов пустой");
        }

        System.out.print("Введите названия файла для чтения: ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        try (InputStream inputStream = new FileInputStream("files/" + fileName)) {
            byte[] buff = new byte[64];
            int n = inputStream.read(buff);
            System.out.println("READ= " + n);
            while (n > 0) {
                System.out.print(new String (buff,0, n));
                n = inputStream.read(buff);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.print("Введите строку для записи в файл: ");
        String userStr = scanner.nextLine();
        byte[] buffer = userStr.getBytes(StandardCharsets.UTF_8);
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("files/" + fileName, true))) {
            outputStream.write(buffer);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
