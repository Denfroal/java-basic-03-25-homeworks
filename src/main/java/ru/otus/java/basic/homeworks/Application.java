package ru.otus.java.basic.homeworks;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        calculateElementValueWithThreads();
        calculateElementValue();
    }

    public static void calculateElementValue() {
        double[] testArray1 = new double [1000000];
        long startTime = System.nanoTime();
        for (int i = 0; i < testArray1.length; i++) {
            testArray1[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        long endTime = System.nanoTime();
        long durationInMillis = (endTime - startTime) / 1000000;
        System.out.println("Время выполнения цикла: " + durationInMillis + " мс");
    }

    static class ArrayFillerTask implements Runnable {
        private final double[] array;
        private final int startIndex;
        private final int endIndex;

        public ArrayFillerTask(double[] array, int startIndex, int endIndex) {
            this.array = array;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }
        @Override
        public void run() {
            for (int i = startIndex; i < endIndex; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        }
    }
    public static void calculateElementValueWithThreads() throws InterruptedException {
        int size = 1000000;
        double[] testArray = new double[size];

        // Количество потоков
        int threadCount = 4;
        // Размер блока для каждого потока
        int chunkSize = size / threadCount; // 250 000

        // Массив для хранения ссылок на потоки
        Thread[] threads = new Thread[threadCount];

        long startTime = System.nanoTime();

        // Создаём и запускаем потоки
        for (int i = 0; i < threadCount; i++) {
            int start = i * chunkSize;
            // Последний поток забирает остаток (на случай, если size не делится нацело)
            int end = (i == threadCount - 1) ? size : start + chunkSize;

            Runnable task = new ArrayFillerTask(testArray, start, end);
            threads[i] = new Thread(task);
            threads[i].start(); // Запускаем поток
        }

        // Главный поток ждёт завершения ВСЕХ рабочих потоков
        for (Thread thread : threads) {
            thread.join(); // Блокируем main, пока поток не завершится
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // мс

        System.out.println("Время выполнения с 4 потоками: " + duration + " мс");

    }
}
